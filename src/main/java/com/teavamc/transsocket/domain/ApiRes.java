package com.teavamc.transsocket.domain;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Date;
/**
 * @author 张超 teavamc
 * @Description:TODO
 * @ClassName ApiRes
 * @date 2019/4/28 23:03
 **/
public class ApiRes extends HashMap {
    private String time;

    /**
        * 构造对象时候创建时间戳
        * @author 张超 teavamc
        * @date 2019/4/28
        * @return
        */
    public ApiRes(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // new Date()为获取当前系统时间，也可使用当前时间戳
        String date = df.format(new Date());
        this.put("time",date);
    }
}
