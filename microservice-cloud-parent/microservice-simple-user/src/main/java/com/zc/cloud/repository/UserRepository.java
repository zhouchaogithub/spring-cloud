/******************************************************************
 *
 *    Package:     com.zc.cloud
 *
 *    Filename:    aa.java
 *
 *    Description: TODO(用一句话描述该文件做什么)
 *
 *    Copyright:   Copyright (c) 2017-2019
 *
 *    @author: zhouchao
 *
 *    @version: 1.0.0
 *
 *    Create at:   2018年9月17日 下午4:05:11
 *
 *    Revision:
 *
 *    2018年9月17日 下午4:05:11
 *        - first revision
 *
 *****************************************************************/
package com.zc.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zc.cloud.entity.User;

/**
 * @author zhouchao
 * @version 1.0.0
 * @ClassName aa
 * @Description TODO(这里用一句话描述这个类的作用)
 * @Date 2018年9月17日 下午4:05:11
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
