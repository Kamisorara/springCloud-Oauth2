package com.user.controller;


import com.commons.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{uid}", method = RequestMethod.GET)
    public User findUserById(@PathVariable("uid") Long uid) {
        return userService.getUserById(uid);
    }

    //根据用户名查询用户
    @GetMapping("/getUserByUsername/{userName}")
    public User getUserByUsername(@PathVariable String userName) {
        return userService.getUserByUserName(userName);

    }

}
