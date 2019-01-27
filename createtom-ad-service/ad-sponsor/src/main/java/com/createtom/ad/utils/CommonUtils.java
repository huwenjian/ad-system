package com.createtom.ad.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Date: 2019/1/27 22:18
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
public class CommonUtils {

    public static String md5(String value) {
        return DigestUtils.md5Hex(value).toUpperCase();
    }
}
