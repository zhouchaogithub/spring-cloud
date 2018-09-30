package com.zc.cloud.dao;

import com.zc.config.FooAuthorizedConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Auther: zhouchao
 * @Date: 2018/9/30 17:02
 * @Description:
 * *******************************************************************************
 * 1、 有url配置时，name只是取了个别名，如果没有则是根据name的值获取服务的地址
 * 2、 当调用需要认证的服务时，添加FooAuthorizedConfiguration.java配置实现登录认证
 * *******************************************************************************
 */
@FeignClient(name = "xxx", url = "http://localhost:8761",configuration = FooAuthorizedConfiguration.class)
public interface UserFeignClient2 {
    @GetMapping(value = "/eureka/apps/{serviceName}") //MICROSERVICE-PROVIDER-USER
    String findEurekaByServiceName(@PathVariable("serviceName") String serviceName);
}
