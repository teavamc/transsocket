package com.teavamc.transsocket.utils;

import com.teavamc.transsocket.domain.ApiRes;
import java.util.List;
import java.util.Set;
import java.util.HashMap;
/**
 * @author 张超 teavamc
 * @Description:Api接口制造器，用于给前端传值 V1.0版本
 * @ClassName ApiMaker
 * @date 2019/4/28 23:14
 **/
public class ApiMaker {

    /**
        * 将List集合数据进行JSON封装
        * @author 张超 teavamc
        * @date 2019/4/28
        * @param [list]
        * @return com.teavamc.transsocket.domain.ApiRes
        */
    public static ApiRes putList(List list){
        ApiRes res = new ApiRes();
        if (list!=null&&!list.isEmpty()){
            res.put("size",list.size());
            res.put("data",list);
        }else {
            res.put("status","1");
        }
        return res;
    }

    /**
        * 将单个的JavaBean进行封装
        * @author 张超 teavamc
        * @date 2019/4/29
        * @param [obj]
        * @return com.teavamc.transsocket.domain.ApiRes
        */
    public static ApiRes putObj(Object obj){
        ApiRes res = new ApiRes();
        if (obj!=null){
            res.put("data",obj);
        }else {
            res.put("status","1");
        }
        return res;
    }


}
