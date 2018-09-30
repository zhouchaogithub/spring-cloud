package com.zc.cloud.controller;

import com.zc.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancedRetryContext;
import org.springframework.cloud.client.loadbalancer.LoadBalancedRetryPolicy;
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
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/movie/{id}")
    public User getUserById(@PathVariable("id") String id) {
        String url = "http://microservice-provider-user/simple/" + id;
        return restTemplate.getForObject(url, User.class);
    }
    @GetMapping("/test")
    public  String test(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("MICROSERVICE-PROVIDER-USER");
        System.out.println("service1:\t"+serviceInstance.getHost()+"\t:\t"+serviceInstance.getPort()+"\t:\t"+serviceInstance.getServiceId());
        ServiceInstance serviceInstance1 = loadBalancerClient.choose("MICROSERVICE-PROVIDER-USER1");
        System.out.println("service2:\t"+serviceInstance1.getHost()+"\t:\t"+serviceInstance1.getPort()+"\t:\t"+serviceInstance1.getServiceId());
        return "success";
    }
}
