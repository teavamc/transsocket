package com.teavamc.transsocket.service.impl;

import com.teavamc.transsocket.domain.User;
import com.teavamc.transsocket.mapper.UserMapper;
import com.teavamc.transsocket.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张超 teavamc
 * @Description:TODO
 * @ClassName UserServiceImpl
 * @date 2019/4/29 21:43
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> selectUser(){
        return userMapper.selectUser();
    }

}
