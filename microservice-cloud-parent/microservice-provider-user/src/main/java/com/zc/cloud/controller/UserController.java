/******************************************************************
 *
 *    Package:     com.zc.cloud.controller
 *
 *    Filename:    UserController.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *    Copyright:   Copyright (c) 2017-2019
 *
 *    @author: zhouchao
 *
 *    @version: 1.0.0
 *
 *    Create at:   2018年9月17日 下午4:07:22
 *
 *    Revision:
 *
 *    2018年9月17日 下午4:07:22
 *        - first revision
 *
 *****************************************************************/
package com.zc.cloud.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.converters.Auto;
import com.netflix.discovery.shared.Application;
import com.zc.cloud.entity.User;
import com.zc.cloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author zhouchao
 * @version 1.0.0
 * @ClassName UserController
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018年9月17日 下午4:07:22
 */
@RestController
public class UserController {
    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/simple/{id}")
    @ResponseBody
    public Optional<User> findById(@PathVariable Long id) {

        return userRepository.findById(id);
    }
    @GetMapping("/eureka-instance")
    public String serviceUrl() {
        InstanceInfo instance = eurekaClient.getNextServerFromEureka("microservice-provider-user", false);
        return instance.getHomePageUrl();
    }
}
