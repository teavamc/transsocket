package com.teavamc.transsocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 张超 teavamc
 * @Description: 底层控制器
 * @ClassName baseController
 * @date 2019/4/28 21:26
 **/
@Controller
@RequestMapping("/base")
public class baseController {

    String prefix = "/base";

    /**
        * 基础控制器 底层页面
        * @author 张超 teavamc
        * @date 2019/4/28
        * @param []
        * @return java.lang.String
        */
    @RequestMapping()
    public String baseIndex(){
        return prefix + "/baseIndex";
    }

}
