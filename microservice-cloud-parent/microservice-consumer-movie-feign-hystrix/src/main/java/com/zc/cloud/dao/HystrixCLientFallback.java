package com.zc.cloud.dao;

import com.zc.cloud.entity.User;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @Auther: zhouchao
 * @Date: 2018/10/3 20:36
 * @Description:
 */
@Component
public class HystrixCLientFallback implements  UserFeginClient{
    @Override
    public Optional<User> findById(Long id) {
        User user = new User();
        user.setId(0L);
        return Optional.of(user);
    }
}
