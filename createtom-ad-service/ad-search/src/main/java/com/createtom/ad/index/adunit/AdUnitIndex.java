package com.createtom.ad.index.adunit;

import com.createtom.ad.index.IndexAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Date: 2019/2/28 16:20
 * Description: 推广单元索引
 * Modify:
 *
 * @author huwenjian
 */
@Slf4j
@Component
public class AdUnitIndex implements IndexAware<Long, AdUnitObject> {


    private static Map<Long, AdUnitObject> objectMap;

    static {
        objectMap = new ConcurrentHashMap<>();
    }

    @Override
    public AdUnitObject get(Long key) {
        return objectMap.get(key);
    }

    @Override
    public void add(Long key, AdUnitObject value) {
        objectMap.put(key, value);
    }

    @Override
    public void update(Long key, AdUnitObject value) {
        AdUnitObject oldAdUnitObject = objectMap.get(key);
        if (oldAdUnitObject == null) {
            objectMap.put(key, value);
        } else {
            oldAdUnitObject.update(value);
        }
    }

    @Override
    public void delete(Long key, AdUnitObject value) {
        objectMap.remove(key);
    }
}
