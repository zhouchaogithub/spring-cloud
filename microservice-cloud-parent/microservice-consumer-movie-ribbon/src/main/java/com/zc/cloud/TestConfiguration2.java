package com.zc.cloud;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: zhouchao
 * @Date: 2018/9/27 23:00
 * @Description: name值一定必须是Eureka中注册的服务名称<BR/>
 * 当前类不能再主类的包及其子包下面(如果放在主类同级或其子包中，也可以解决)
 * The CustomConfiguration clas must be a @Configuration class,<BR/>
 * but take care that it is not in a @ComponentScan for the main application context.<BR/>
 * Otherwise, it is shared by all the @RibbonClients.<BR/>
 * If you use @ComponentScan (or @SpringBootApplication),<BR/>
 * you need to take steps to avoid it being included (for instance,<BR/>
 * you can put it in a separate, non-overlapping package or specify<BR/>
 * the packages to scan explicitly in the @ComponentScan).<BR/>
 ****************************************************
 * //这个类不能喝Spring Boot @ConponentScan所在主类放在同一个包或其子包下，
 * 否则需要些Exclude类做区分
 * **************************************************
 */
@ExcludeFromComponentScanner
@Configuration
public class TestConfiguration2 {
    @Autowired
    private IClientConfig config;
    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new RandomRule();
    }
}
