package com.createtom.ad.index.interest;

import com.createtom.ad.index.IndexAware;
import com.createtom.ad.utils.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * Date: 2019/3/5 10:25
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
@Slf4j
@Component
public class UnitItIndex implements IndexAware<String, Set<Long>> {

    private static Map<String, Set<Long>> itUnitMap;
    private static Map<Long, Set<String>> unitItMap;

    static {
        itUnitMap = new ConcurrentHashMap<>();
        unitItMap = new ConcurrentHashMap<>();
    }


    @Override
    public Set<Long> get(String key) {
        return itUnitMap.get(key);
    }

    @Override
    public void add(String key, Set<Long> value) {

        Set<Long> unitIds = CommonUtils.getOrCreate(key, itUnitMap, ConcurrentSkipListSet::new);
        unitIds.addAll(value);

        value.stream().map(unit -> CommonUtils.getOrCreate(unit, unitItMap, ConcurrentSkipListSet::new)).forEach(its -> its.add(key));
    }

    @Override
    public void update(String key, Set<Long> value) {
        log.info("更新方案成本过高");
    }

    @Override
    public void delete(String key, Set<Long> value) {

        Set<Long> unitIds = CommonUtils.getOrCreate(key, itUnitMap, ConcurrentSkipListSet::new);
        unitIds.removeAll(value);

        value.stream().map(it -> CommonUtils.getOrCreate(it, unitItMap, ConcurrentSkipListSet::new)).forEach(itIds -> itIds.remove(key));


    }
}
