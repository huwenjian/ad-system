package com.createtom.ad.dao;

import com.createtom.ad.entity.AdUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Date: 2019/1/27 21:46
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
public interface AdUserRepository extends JpaRepository<AdUser, Long> {

    /**
     * <h2>根据用户名查找用户记录</h2>
     */
    AdUser findByUsername(String username);
}