package com.createtom.ad.index.creativeunit;

import com.createtom.ad.index.IndexAware;
import com.createtom.ad.index.adunit.AdUnitObject;
import com.createtom.ad.utils.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Date: 2019/3/11 16:10
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
@Slf4j
@Component
public class CreativeUnitIndex implements IndexAware<String, CreativeUnitObject> {

    /**
     * <creativeId-unitId, CreativeUnitObject>
     */
    private static Map<String, CreativeUnitObject> objectMap;
    /**
     * <creativeId, unitId Set>
     */
    private static Map<Long, Set<Long>> creativeUnitMap;
    /**
     * <unitId, creative set>
     */
    private static Map<Long, Set<Long>> unitCreativeMap;

    static {
        objectMap = new ConcurrentHashMap<>();
        creativeUnitMap = new ConcurrentHashMap<>();
        unitCreativeMap = new ConcurrentHashMap<>();
    }

    @Override
    public CreativeUnitObject get(String key) {
        return objectMap.get(key);
    }

    @Override
    public void add(String key, CreativeUnitObject value) {
        objectMap.put(key, value);

        Set<Long> unitSet = CommonUtils.getOrCreate(value.getAdId(),creativeUnitMap,CopyOnWriteArraySet::new);
        unitSet.add(value.getUnitId());

        Set<Long> creativeSet = CommonUtils.getOrCreate(value.getAdId(),unitCreativeMap,ConcurrentSkipListSet::new);
        creativeSet.add(value.getAdId());

    }

    @Override
    public void update(String key, CreativeUnitObject value) {
        log.error("CreativeUnitIndex not support update");
    }

    @Override
    public void delete(String key, CreativeUnitObject value) {

        objectMap.remove(key);

        Set<Long> unitSet = creativeUnitMap.get(value.getAdId());
        if (CollectionUtils.isNotEmpty(unitSet)) {
            unitSet.remove(value.getUnitId());
        }

        Set<Long> creativeSet = unitCreativeMap.get(value.getUnitId());
        if (CollectionUtils.isNotEmpty(creativeSet)) {
            creativeSet.remove(value.getAdId());
        }
    }

    public List<Long> selectAds(List<AdUnitObject> unitObjects) {

        if (CollectionUtils.isEmpty(unitObjects)) {
            return Collections.emptyList();
        }

        List<Long> result = new ArrayList<>();

        unitObjects.stream()
                .map(unitObject -> unitCreativeMap.get(unitObject.getUnitId()))
                .filter(CollectionUtils::isNotEmpty)
                .forEach(result::addAll);
        return result;
    }
}

