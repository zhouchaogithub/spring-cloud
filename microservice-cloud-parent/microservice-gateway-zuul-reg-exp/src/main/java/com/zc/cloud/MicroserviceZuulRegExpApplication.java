package com.zc.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
public class MicroserviceZuulRegExpApplication{

    public static void main(String[] args) {

        SpringApplication.run(MicroserviceZuulRegExpApplication.class, args);
    }
    @Bean
    public PatternServiceRouteMapper serviceRouteMapper(){
        return  new PatternServiceRouteMapper(
                "(?<name>^.+)-(?<version>v.+$)",
                "${version}/${name}");
    }
}
