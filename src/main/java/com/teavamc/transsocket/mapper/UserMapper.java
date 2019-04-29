package com.teavamc.transsocket.mapper;

import com.teavamc.transsocket.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 张超 teavamc
 * @Description: user业务的DAO层
 * @Mapper 注解标记这是一个mapper文件，不用再application中使用@MapperScan注解
 * @Repository 注解表示这是一个DAO层文件
 * @ClassName UserMapper
 * @date 2019/4/29 21:59
 **/
@Mapper
@Repository
public interface UserMapper {

    public List<User> selectUser();

}
