package com.zc.cloud;

import com.zc.config.TestConfiguration1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "MICROSERVICE-PROVIDER-USER", configuration = TestConfiguration1.class)
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = ExcludeFromComponentScanner.class)})
@RibbonClient(name = "MICROSERVICE-PROVIDER-USER", configuration = TestConfiguration2.class)
public class MicroserviceConsumerMovieRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerMovieRibbonApplication.class, args);
    }
    @Bean
    @LoadBalanced //ribbon负载均衡（默认是轮询的方式实现负载均衡）
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
