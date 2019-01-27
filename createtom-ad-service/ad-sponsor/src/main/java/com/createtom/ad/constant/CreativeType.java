package com.createtom.ad.constant;

import lombok.Getter;

/**
 * Date: 2019/1/27 21:37
 * Description: 创意类型 也许用不到
 * Modify:
 *
 * @author huwenjian
 */

@Getter
public enum CreativeType {

    IMAGE(1, "图片"),
    VIDEO(2, "视频"),
    TEXT(3, "文本");

    private int type;
    private String desc;

    CreativeType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
