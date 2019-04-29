package com.teavamc.transsocket.mapper;

import com.teavamc.transsocket.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 张超 teavamc
 * @Description:TODO
 * @ClassName UserMapper
 * @date 2019/4/29 21:59
 **/
@Mapper
@Repository
public interface UserMapper {

    public List<User> selectUser();

}
