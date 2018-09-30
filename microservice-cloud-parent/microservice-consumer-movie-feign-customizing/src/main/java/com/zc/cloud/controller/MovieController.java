package com.zc.cloud.controller;

import com.zc.cloud.dao.UserFeignClient;
import com.zc.cloud.dao.UserFeignClient2;
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
    private UserFeignClient userFeignClient;
    @Autowired
    private UserFeignClient2 userFeignClient2;

    @GetMapping("/movie/{id}")
    public Optional<User> getUserById(@PathVariable("id") Long id) {
        return userFeignClient.findById(id);
    }

    @GetMapping("/findEurekaByServiceName/{serviceName}")
    public String findEurekaByServiceName(@PathVariable("serviceName") String serviceName){
        return userFeignClient2.findEurekaByServiceName(serviceName);
    }
}
