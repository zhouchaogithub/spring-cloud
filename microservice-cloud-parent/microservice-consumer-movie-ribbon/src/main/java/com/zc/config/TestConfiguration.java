package com.zc.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: zhouchao
 * @Date: 2018/9/27 23:00
 * @Description: name值一定必须是Eureka中注册的服务名称<BR/>
 * 当前类不能再主类的包及其子包下面
 */
@Configuration
public class TestConfiguration {
    @Autowired
    private IClientConfig config;
    public IRule ribbonRule(IClientConfig config) {

        return new RandomRule();  //随机方式的负载均衡模式
    }

}
