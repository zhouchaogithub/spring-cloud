/******************************************************************
 *
 *    Package:     com.zc.cloud
 *
 *    Filename:    User.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *    Copyright:   Copyright (c) 2017-2019
 *
 *    @author: zhouchao
 *
 *    @version: 1.0.0
 *
 *    Create at:   2018年9月17日 下午3:57:27
 *
 *    Revision:
 *
 *    2018年9月17日 下午3:57:27
 *        - first revision
 *
 *****************************************************************/
package com.zc.cloud.entity;
/**
 * @ClassName User
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author zhouchao
 * @Date 2018年9月17日 下午3:57:27
 * @version 1.0.0
 */

import java.io.Serializable;
import java.math.BigDecimal;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String username;
    private String name;
    private int age;
    private BigDecimal balance;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
