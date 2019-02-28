package com.createtom.ad.index.adplan;

import com.createtom.ad.index.IndexAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Date: 2019/2/28 15:49
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
@Slf4j
@Component
public class AdPlanIndex implements IndexAware<Long, AdPlanObject> {

    private static Map<Long, AdPlanObject> objectMap;

    /**
     * 线程安全的map
     */
    static {
        objectMap = new ConcurrentHashMap<>();
    }


    @Override
    public AdPlanObject get(Long key) {
        return objectMap.get(key);
    }

    @Override
    public void add(Long key, AdPlanObject value) {
        log.info("before add :{}" + objectMap);
        objectMap.put(key, value);
        log.info("after add :{}" + objectMap);
    }

    @Override
    public void update(Long key, AdPlanObject value) {
        log.info("before update :{}" + objectMap);
        AdPlanObject oldAdPlanObject = objectMap.get(key);
        if (null == oldAdPlanObject) {
            objectMap.put(key, value);
        } else {
            oldAdPlanObject.update(value);
        }
        log.info("after update :{}" + objectMap);

    }

    @Override
    public void delete(Long key, AdPlanObject value) {
        log.info("before delete :{}" + objectMap);
        objectMap.remove(key);
        log.info("after  delete :{}" + objectMap);
    }
}
