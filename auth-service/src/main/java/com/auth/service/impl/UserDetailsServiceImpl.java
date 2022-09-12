package com.auth.service.impl;


import com.auth.bean.UserVoDetail;
import com.auth.mapper.UserLoginMapper;
import com.commons.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Pan Weilong
 * @date 2019/7/9 15:57
 * @description: 接口.
 */

@Component("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private UserLoginMapper userLoginMapper;


    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userLoginMapper.getUserByUserName(userName);
        if (user == null) {
            throw new UsernameNotFoundException("用户不存在或密码错误");
        }
        UserVoDetail userVoDetail = new UserVoDetail();
        userVoDetail.setUserId(user.getUid());
        userVoDetail.setUsername(user.getUserName());
        userVoDetail.setPassword(user.getPassword());
        return userVoDetail;
    }
}

