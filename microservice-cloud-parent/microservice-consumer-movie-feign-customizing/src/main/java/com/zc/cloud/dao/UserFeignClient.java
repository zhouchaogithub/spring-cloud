package com.zc.cloud.dao;

import com.zc.cloud.entity.User;
import com.zc.config.FooConfiguration;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

/**
 * @Auther: zhouchao
 * @Date: 2018/9/30 12:36
 * @Description:
 * *******************************************************************************
 * 覆写Feign默认配置
 * 注意：
 * 1、Optional<User> findById(@PathVariable("id") Long id);中@PathVariable("id")必加
 * 2、在低版本中类该接口中方法注解 @RequestMapping(value = "XXX",method = RequestMethod.X ),
 *   不支持@XXMapping组合注解
 * 3、@FeignClient("yyy"),yyy表示需要调用的服务id，能在eureka等注册中心查看到的
 * 4、覆写Feign的配置，需要指定 configuration = FooConfiguration.class，不过
 *    FooConfiguration.java不能和主类同包或其子包
 * *******************************************************************************
 */
@FeignClient(name = "microservice-provider-user",configuration = FooConfiguration.class)
public interface UserFeignClient {
    //@RequestMapping(value = "/simple/{id}",method = RequestMethod.GET )
    @RequestLine("GET /simple/{id}")
    Optional<User> findById(@Param("id") Long id);
}
