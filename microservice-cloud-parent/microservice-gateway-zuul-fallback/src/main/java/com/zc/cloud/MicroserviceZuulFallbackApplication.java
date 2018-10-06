package com.zc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MicroserviceZuulFallbackApplication{

    public static void main(String[] args) {

        SpringApplication.run(MicroserviceZuulFallbackApplication.class, args);
    }
}
