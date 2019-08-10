package com.example.gz.controller;

import com.example.gz.domain.User;
import com.example.gz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangjunfeng
 * @version 1.0
 * @desc The type Sale menu service.
 * @since 2019/8/10
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}/{name}")
    public User detail(@PathVariable Integer id,@PathVariable String name) {
        return userService.detail(id, name);
    }
}