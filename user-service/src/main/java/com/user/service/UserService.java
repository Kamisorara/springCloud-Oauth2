package com.user.service;


import com.commons.entity.User;

public interface UserService {
    User getUserById(Long userId);

    /**
     * 根据用户名查询用户
     *
     * @param userName
     * @return
     */
    User getUserByUserName(String userName);
}
