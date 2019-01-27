package com.createtom.ad.constant;

import lombok.Getter;

/**
 * Date: 2019/1/27 11:52
 * Description: 通用状态
 * Modify:
 *
 * @author huwenjian
 */
@Getter
public enum CommonStatus {
    VALID(1, "有效状态"),
    INVALID(0, "无效状态");

    private Integer status;
    private String desc;

    CommonStatus(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }
}
