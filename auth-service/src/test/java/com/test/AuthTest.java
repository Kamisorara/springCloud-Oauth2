package com.test;

import com.auth.mapper.UserLoginMapper;
import com.commons.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;

public class AuthTest {

    @Resource
    private UserLoginMapper userLoginMapper;

    private static BCryptPasswordEncoder passwordEncoder;

    @Test
    void test1() {
        //测试password加密
        User user = new User();
        user.setUserName("Kamisora");
        String password = "123456";
//        password = passwordEncoder.encode(password);
        user.setPassword(password);
        userLoginMapper.insert(user);
    }
}
