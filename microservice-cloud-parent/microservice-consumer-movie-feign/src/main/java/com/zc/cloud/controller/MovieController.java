package com.zc.cloud.controller;

import com.zc.cloud.dao.UserFeginClient;
import com.zc.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @Auther: zhouchao
 * @Date: 2018/9/24 23:39
 * @Description:
 */
@RestController
public class MovieController {
    @Autowired
    private UserFeginClient userFeginClient;

    @GetMapping("/movie/{id}")
    public Optional<User> getUserById(@PathVariable("id") Long id) {
        return userFeginClient.findById(id);
    }
}
