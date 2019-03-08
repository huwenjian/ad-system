package com.createtom.ad.utils;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Date: 2019/3/5 10:45
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
public class CommonUtilsTest {

    @Test
    public void getOrCreate() {
        Map<String, String> map = new HashMap();
        map.put("huwenjian", "huwenjianvalue");
        map.put("liujing", "liujingvalue");
        map.put("zhongshi","");

        String newKey = "dandan";

        Object dandan = map.computeIfAbsent(newKey, i -> "");

        System.out.println("dandan " + dandan);
        Object huwenjian = map.computeIfAbsent("huwenjian", String::intern);
        System.out.println("huwenjian " + huwenjian);

        Object zhongshi = map.computeIfAbsent("zhongshi",String::toString);
        System.out.println(zhongshi);

        map.put(newKey, "dd111");

        System.out.println(map);
    }
}
