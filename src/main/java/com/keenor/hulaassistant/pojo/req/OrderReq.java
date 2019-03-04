package com.keenor.hulaassistant.pojo.req;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class OrderReq {


    /**
     * _org : 59cb5c718e1e92a702eca340
     * _member : 5a3957362c36e4cc1c8c1f2a
     * openid : oZO1N0hp18bh0CO-gz_3W757IZDw
     * orderDate : 1551854921000
     * orderItem : [{"_field":"59cded4c6f1d65ba08316197","_time":"5a3337c7c484eb021ff0768a","fName":"羽毛球15","showDate":"8:00--9:00","price":18,"field":{"order":15,"or":2,"flag":true,"isOpen":true,"_id":"59cded4c6f1d65ba08316197","name":"羽毛球15","unit":"hours","isChoose":false,"p":20,"height":{"height":"0.4rem","line-height":"0.37rem","width":"0.75rem"}},"time":{"_id":"5a3337c7c484eb021ff0768a","__v":1,"_item":"59cc95c342fa6b6703843bb9","_organization":"59cb5c718e1e92a702eca340","_venue":"59cc969742fa6b6703843bbe","close_endDate":"2019-02-10T15:59:59.000Z","close_startDate":"2019-02-07T16:00:00.000Z","continueHours":1,"createDate":"2017-12-15T02:47:35.236Z","endDate":9,"endDateHours":9,"endDateMins":0,"showDate":"8:00--9:00","startDate":8,"startDateHours":8,"startDateMins":0,"isUsed":true,"price":[{"_id":"5a3337c7c484eb021ff07691","price":20,"unit":"hours","week":1},{"_id":"5a3337c7c484eb021ff07690","price":20,"unit":"hours","week":2},{"_id":"5a3337c7c484eb021ff0768f","price":20,"unit":"hours","week":3},{"_id":"5a3337c7c484eb021ff0768e","price":20,"unit":"hours","week":4},{"_id":"5a3337c7c484eb021ff0768d","price":20,"unit":"hours","week":5},{"_id":"5a3337c7c484eb021ff0768c","price":40,"unit":"hours","week":6},{"_id":"5a3337c7c484eb021ff0768b","price":40,"unit":"hours","week":0},{"_id":"5a58185fe56cca3c1a1a21b6","price":0,"unit":"hours","week":7}],"st":"2019-03-03T00:00:42.093Z","et":"2019-03-03T01:00:42.093Z","fields":[{"order":1,"or":2,"flag":false,"isOpen":true,"_id":"59cdecfd6f1d65ba08316189","name":"羽毛球01","unit":"hours","isChoose":true,"p":20,"height":{"height":"0.4rem","line-height":"0.37rem","width":"0.75rem"}},{"order":2,"or":2,"flag":false,"isOpen":true,"_id":"59cded016f1d65ba0831618a","name":"羽毛球02","unit":"hours","isChoose":true,"p":20,"height":{"height":"0.4rem","line-height":"0.37rem","width":"0.75rem"}},{"order":3,"or":2,"flag":false,"isOpen":true,"_id":"59cded066f1d65ba0831618b","name":"羽毛球03","unit":"hours","isChoose":true,"p":20,"height":{"height":"0.4rem","line-height":"0.37rem","width":"0.75rem"}},{"order":4,"or":2,"flag":false,"isOpen":true,"_id":"59cded0a6f1d65ba0831618c","name":"羽毛球04","unit":"hours","isChoose":true,"p":20,"height":{"height":"0.4rem","line-height":"0.37rem","width":"0.75rem"}},{"order":5,"or":2,"flag":false,"isOpen":true,"_id":"59cded106f1d65ba0831618d","name":"羽毛球05","unit":"hours","isChoose":true,"p":20,"height":{"height":"0.4rem","line-height":"0.37rem","width":"0.75rem"}},{"order":6,"or":2,"flag":false,"isOpen":true,"_id":"59cded166f1d65ba0831618e","name":"羽毛球06","unit":"hours","isChoose":true,"p":20,"height":{"height":"0.4rem","line-height":"0.37rem","width":"0.75rem"}},{"order":7,"or":2,"flag":false,"isOpen":true,"_id":"59cded1b6f1d65ba0831618f","name":"羽毛球07","unit":"hours","isChoose":true,"p":20,"height":{"height":"0.4rem","line-height":"0.37rem","width":"0.75rem"}},{"order":8,"or":2,"flag":false,"isOpen":true,"_id":"59cded216f1d65ba08316190","name":"羽毛球08","unit":"hours","isChoose":true,"p":20,"height":{"height":"0.4rem","line-height":"0.37rem","width":"0.75rem"}},{"order":9,"or":2,"flag":false,"isOpen":true,"_id":"59cded276f1d65ba08316191","name":"羽毛球09","unit":"hours","isChoose":true,"p":20,"height":{"height":"0.4rem","line-height":"0.37rem","width":"0.75rem"}},{"order":10,"or":2,"flag":false,"isOpen":true,"_id":"59cded336f1d65ba08316192","name":"羽毛球10","unit":"hours","isChoose":true,"p":20,"height":{"height":"0.4rem","line-height":"0.37rem","width":"0.75rem"}},{"order":11,"or":2,"flag":false,"isOpen":true,"_id":"59cded386f1d65ba08316193","name":"羽毛球11","unit":"hours","isChoose":false,"p":20,"height":{"height":"0.4rem","line-height":"0.37rem","width":"0.75rem"}},{"order":12,"or":2,"flag":false,"isOpen":true,"_id":"59cded3c6f1d65ba08316194","name":"羽毛球12","unit":"hours","isChoose":false,"p":20,"height":{"height":"0.4rem","line-height":"0.37rem","width":"0.75rem"}},{"order":13,"or":2,"flag":false,"isOpen":true,"_id":"59cded416f1d65ba08316195","name":"羽毛球13","unit":"hours","isChoose":false,"p":20,"height":{"height":"0.4rem","line-height":"0.37rem","width":"0.75rem"}},{"order":14,"or":2,"flag":false,"isOpen":true,"_id":"59cded476f1d65ba08316196","name":"羽毛球14","unit":"hours","isChoose":false,"p":20,"height":{"height":"0.4rem","line-height":"0.37rem","width":"0.75rem"}},{"order":15,"or":2,"flag":true,"isOpen":true,"_id":"59cded4c6f1d65ba08316197","name":"羽毛球15","unit":"hours","isChoose":false,"p":20,"height":{"height":"0.4rem","line-height":"0.37rem","width":"0.75rem"}}]},"flag":true}]
     * payment : member
     * nowStr : 1551595500000
     * randomStr : YMjynFXYYXGSJ
     * sign : Ma3Fj7362c36e4ccYc8cyf2a1nX1Y955YXGSJ
     */

    private String _org;
    private String _member;
    private String openid;
    private Long orderDate;
    private String payment = "member";
    private Long nowStr;
    private String randomStr;
    private String sign;
    private List<OrderItem> orderArr;

    @NoArgsConstructor
    @Data
    public static class OrderItem {

        private String _field;
        private String _time;
        private String fName;
        private String showDate;
        private Integer price;
        private Field field;
        private Time time;
        private Boolean flag;

    }
}
