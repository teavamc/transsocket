package com.teavamc.transsocket.api;

import com.teavamc.transsocket.domain.ApiRes;
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
@RequestMapping(value = "/api/base")
public class baseApi {

    /**
        * baseApi
        * @author 张超 teavamc
        * @date 2019/4/28
        * @return java.lang.String
        */
    @GetMapping()
    public ApiRes base(){
        ApiRes res = new ApiRes();
        res.put("data","welcome Request");
        return res;
    }
}
