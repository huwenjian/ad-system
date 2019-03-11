package com.createtom.ad.index.district;

import com.createtom.ad.index.IndexAware;
import com.createtom.ad.utils.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * Date: 2019/3/11 10:14
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
@Slf4j
@Component
public class UnitDistrictIndex implements IndexAware<String, Set<Long>> {
    private static Map<String, Set<Long>> districtUnitMap;
    private static Map<Long, Set<String>> unitDistrictMap;

    static {
        districtUnitMap = new ConcurrentHashMap<>();
        unitDistrictMap = new ConcurrentHashMap<>();
    }

    @Override
    public Set<Long> get(String key) {
        return districtUnitMap.get(key);
    }

    @Override
    public void add(String key, Set<Long> value) {
        Set<Long> unitIds = CommonUtils.getOrCreate(key, districtUnitMap, ConcurrentSkipListSet::new);
        unitIds.addAll(value);

        value.stream()
                .map(unitId -> CommonUtils.getOrCreate(unitId, unitDistrictMap, ConcurrentSkipListSet::new))
                .forEach(districts -> districts.add(key));
    }

    @Override
    public void update(String key, Set<Long> value) {

    }

    @Override
    public void delete(String key, Set<Long> value) {

        Set<Long> unitIds = CommonUtils.getOrCreate(key, districtUnitMap, ConcurrentSkipListSet::new);
        unitIds.removeAll(value);
        /**
         * 删除每一个推广单元下面的地域限制
         */
        value.stream()
                .map(unitId -> CommonUtils.getOrCreate(unitId, unitDistrictMap, ConcurrentSkipListSet::new))
                .forEach(districtSets -> districtSets.remove(key));
    }


}
