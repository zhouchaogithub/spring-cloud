package com.zc.cloud.dao;

/**
 * @Auther: zhouchao
 * @Date: 2018/10/3 21:10
 * @Description:
 */
public class FeignClient2Fallback implements  UserFeignClient2{
    @Override
    public String findEurekaByServiceName(String serviceName) {
        return null;
    }
}
