package com.zc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Configuration
//@EnableEurekaClient
public class MicroserviceSimpleMovieApplication {
    public static void main(String[] args) {

        SpringApplication.run(MicroserviceSimpleMovieApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {

        return new RestTemplate();
    }
}
