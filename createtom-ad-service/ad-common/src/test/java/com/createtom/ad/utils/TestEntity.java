package com.createtom.ad.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Date: 2019/1/28 12:45
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestEntity {
    private Long id;

    private Long userId;

    private String planName;

    private Integer planStatus;

    private Date startDate;

    private Date endDate;

    private Date createTime;

    private Date updateTime;

}
