package com.zc.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: zhouchao
 * @Date: 2018/10/7 21:55
 * @Description:
 */
@RestController
@RequestMapping("/config")
public class ConfigClientController {
    @Value("${profile}")
    private String profile;

    @GetMapping("/getProfile")
    public String getProfile() {
        return profile;
    }


}
