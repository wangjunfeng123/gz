package com.example.gz.service;

import com.example.gz.domain.User;
import org.springframework.stereotype.Service;

/**
 * @author wangjunfeng
 * @version 1.0
 * @desc user service.
 * @since 2019/8/10
 */
@Service
public class UserService {

    public User detail(Integer id, String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        return user;
    }

}