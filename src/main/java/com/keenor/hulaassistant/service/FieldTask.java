package com.keenor.hulaassistant.service;

import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.scheduling.support.PeriodicTrigger;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.annotation.Resource;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class FieldTask {

    @Resource
    private ThreadPoolTaskScheduler threadPoolTaskScheduler;

    private ScheduledFuture<?> future;

    ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);

    @Resource
    BookingService bookingService;

    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler() {
        return new ThreadPoolTaskScheduler();
    }

    private volatile boolean ifSuccess = false;

    @Scheduled(cron = "50 59 6 ? * 3")
    public void fieldJob() {
        log.info("start fieldJob...");
        while (true) {
            Long todayTime = bookingService.getTodayTime();
            LocalTime current = LocalDateTime.ofInstant(
                    Instant.ofEpochMilli(todayTime), ZoneId.systemDefault()).toLocalTime();
            log.info("CURRENT-TIME: {}", DateTimeFormatter.ofPattern("HH:mm:ss").format(current));

            LocalTime targetTime = LocalTime.of(7, 0);
            if (!current.isBefore(targetTime)) {
                startJob();
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                log.error("", e);
            }
        }
    }

    @Scheduled(cron = "30 1 7 ? * 3")
    public void fieldJobStop() {
        log.info("stop fieldJob...");
        stopJob();
    }

    public boolean startJob() {
        future = threadPoolTaskScheduler.schedule(new MyRunnable(), new PeriodicTrigger(3, TimeUnit.SECONDS));
        log.info("DynamicTask.startJob() ...");
        return future.isDone();
    }

    public boolean stopJob() {
        if (future != null) {
            future.cancel(true);
        }
        log.info("DynamicTask.stopJob() ...");
        return future.isCancelled();
    }

    private class MyRunnable implements Runnable {

        @Override
        public void run() {
            log.info("job run... {}", new Date());

            if (ifSuccess) {
                return;
            }

            for (int i = 0; i < 15; i += 3) {
                if (ifSuccess) {
                    return;
                }
                Future<Integer> future = null;
                for (int j = i; j < i + 3; j++) {
                    int k = j;
                    future = fixedThreadPool.submit(
                            () -> bookingService.order(k + 1));
                }
                while (future != null && !future.isDone()) {
                    Integer code;
                    try {
                        code = future.get(3, TimeUnit.SECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e) {
                        e.printStackTrace();
                        continue;
                    }
                    if (code == 200) {
                        log.info("haha... 抢到场子了");
                        ifSuccess = true;
                        future.cancel(true);
                        stopJob();
                        break;
                    }
                }

            }
        }
    }

}
