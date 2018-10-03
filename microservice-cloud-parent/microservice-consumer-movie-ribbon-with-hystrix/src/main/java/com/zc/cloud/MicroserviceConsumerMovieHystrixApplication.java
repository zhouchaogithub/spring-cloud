package com.zc.cloud;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class MicroserviceConsumerMovieHystrixApplication{
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerMovieHystrixApplication.class, args);
    }
    @Bean
    @LoadBalanced //ribbon负载均衡（默认是轮询的方式实现负载均衡）
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
