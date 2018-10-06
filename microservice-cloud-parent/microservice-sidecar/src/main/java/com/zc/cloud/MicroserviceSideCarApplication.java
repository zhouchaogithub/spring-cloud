package com.zc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableSidecar
public class MicroserviceSideCarApplication{

    public static void main(String[] args) {

        SpringApplication.run(MicroserviceSideCarApplication.class, args);
    }
}
