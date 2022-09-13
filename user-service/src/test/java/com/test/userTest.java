package com.test;

import com.commons.entity.User;
import com.user.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class userTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void test1() {
        //测试password加密
        User user = new User();
        user.setUserName("Kamisora");
        String password = "123456";
        user.setPassword(password);
        userMapper.insert(user);
    }

}
