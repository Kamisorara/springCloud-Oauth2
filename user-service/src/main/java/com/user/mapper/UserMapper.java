package com.user.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.commons.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    User getUserById(Long userId);

    //根据根据用户名查询用户
    User getUserByUserName(String userName);
}
