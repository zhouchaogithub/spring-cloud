package com.zc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceConsumerMovieWithoutEurekaRibbonApplication{
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerMovieWithoutEurekaRibbonApplication.class, args);
    }
    @Bean
    @LoadBalanced //ribbon负载均衡（默认是轮询的方式实现负载均衡）
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
