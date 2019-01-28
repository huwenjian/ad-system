package com.createtom.ad.dao;

import com.createtom.ad.entity.Creative;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Date: 2019/1/27 21:55
 * Description:
 * Modify:
 *
 * @author huwenjian
 * @todo: 用jpa相对于mybatis 手写sql 来说 慢一点
 */
public interface CreativeRepository extends JpaRepository<Creative, Long> {
    Creative findByName(String name);
}
