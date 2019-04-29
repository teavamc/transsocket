package com.teavamc.transsocket.service.impl;

import com.teavamc.transsocket.domain.User;
import com.teavamc.transsocket.mapper.UserMapper;
import com.teavamc.transsocket.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张超 teavamc
 * @Description: user业务实现类
 * @Service注解表示这是一个业务类
 * @ClassName UserServiceImpl
 * @date 2019/4/29 21:43
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
        * 查询user表的所有的用户
        * @author 张超 teavamc
        * @date 2019/4/29
        * @param []
        * @return java.util.List<com.teavamc.transsocket.domain.User>
        */
    @Override
    public List<User> selectUser(){
        return userMapper.selectUser();
    }

}
