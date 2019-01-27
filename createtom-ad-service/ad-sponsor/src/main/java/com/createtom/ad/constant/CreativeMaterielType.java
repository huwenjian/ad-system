package com.createtom.ad.constant;

import lombok.Getter;

/**
 * Date: 2019/1/27 21:39
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
@Getter
public enum CreativeMaterielType {
    JPG(1, "jpg"),
    BMP(2, "bmp"),

    MP4(3, "mp4"),
    AVI(4, "avi"),

    TXT(5, "txt");

    private int type;
    private String desc;

    CreativeMaterielType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

}
