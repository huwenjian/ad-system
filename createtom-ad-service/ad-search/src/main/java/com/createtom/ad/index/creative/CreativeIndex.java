package com.createtom.ad.index.creative;

import com.createtom.ad.index.IndexAware;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Date: 2019/3/11 16:02
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
public class CreativeIndex implements IndexAware<Long, CreativeObject> {

    private static Map<Long, CreativeObject> creativeObjectMap;

    static {
        creativeObjectMap = new ConcurrentHashMap<>();
    }

    @Override
    public CreativeObject get(Long key) {
        return creativeObjectMap.get(key);
    }

    @Override
    public void add(Long key, CreativeObject value) {
        creativeObjectMap.put(key, value);
    }

    @Override
    public void update(Long key, CreativeObject value) {
        CreativeObject oldCreativeObj = creativeObjectMap.get(key);
        if (oldCreativeObj == null) {
            creativeObjectMap.put(key, value);
        } else {
            oldCreativeObj.update(value);
        }

    }

    @Override
    public void delete(Long key, CreativeObject value) {
        creativeObjectMap.remove(key);
    }
}
