package com.teavamc.transsocket.api;

import com.teavamc.transsocket.domain.ApiRes;
import com.teavamc.transsocket.service.IUserService;
import com.teavamc.transsocket.utils.ApiMaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张超 teavamc
 * @Description:baseApi
 * @ClassName baseApi
 * @date 2019/4/28 22:57
 **/
@RestController
@RequestMapping(value = "/api")
public class baseApi {

    @Autowired
    private IUserService userService;

    /**
        * baseApi
        * @author 张超 teavamc
        * @date 2019/4/28
        * @return java.lang.String
        */
    @GetMapping(value = "/base")
    public ApiRes base(){
        ApiRes res = new ApiRes();
        res.put("data","Request Succeed");
        return res;
    }

    /**
        * 测试CRUD功能的接口
        * @author 张超 teavamc
        * @date 2019/4/29
        * @param []
        * @return com.teavamc.transsocket.domain.ApiRes
        */
    @GetMapping(value = "/selectuser")
    public ApiRes selectUser(){
        return ApiMaker.putList(userService.selectUser());
    }

}
