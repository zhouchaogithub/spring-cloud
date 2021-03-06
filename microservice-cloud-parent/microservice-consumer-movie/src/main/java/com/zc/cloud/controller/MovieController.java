package com.zc.cloud.controller;

import com.zc.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: zhouchao
 * @Date: 2018/9/24 23:39
 * @Description:
 */
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${user.userServicePath}")
    private String userServiceUrl;

    @GetMapping("/movie/{id}")
    public User getUserById(@PathVariable("id") String id, HttpServletRequest request) {
        return restTemplate.getForObject(userServiceUrl+ id, User.class);
    }
}
