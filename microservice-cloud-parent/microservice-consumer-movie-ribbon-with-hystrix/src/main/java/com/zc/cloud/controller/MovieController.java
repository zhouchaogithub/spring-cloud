package com.zc.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zc.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: zhouchao
 * @Date: 2018/9/24 23:39
 * @Description:
 */
@RestController
public class MovieController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;

    public User findByIdFallback(Long id) {
        User user = new User();
        user.setId(0L);
        return user;
    }

    @GetMapping("/movie/{id}")
    @HystrixCommand(fallbackMethod = "findByIdFallback")
    public User getUserById(@PathVariable("id") Long id) {
        String url = "http://microservice-provider-user/simple/" + id;
        return restTemplate.getForObject(url, User.class);
    }
}
