package com.zc.cloud.dao;

import com.zc.cloud.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

/**
 * @Auther: zhouchao
 * @Date: 2018/9/30 12:36
 * @Description:
 */
@FeignClient(name = "MICROSERVICE-PROVIDER-USER",fallback = HystrixCLientFallback.class)
public interface UserFeginClient {
    //@RequestMapping(value = "/simple/{id}",method = RequestMethod.GET )
    @GetMapping("/simple/{id}")
    Optional<User> findById(@PathVariable("id") Long id);
}
