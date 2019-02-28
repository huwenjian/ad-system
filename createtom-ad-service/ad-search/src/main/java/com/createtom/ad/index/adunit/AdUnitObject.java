package com.createtom.ad.index.adunit;

import com.createtom.ad.index.adplan.AdPlanObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Date: 2019/2/28 16:10
 * Description: 推广单元的索引对象
 * Modify:
 *
 * @author huwenjian
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdUnitObject {
    private Long unitId;
    private Integer unitStatus;
    private Integer positionType;
    private Long planId;
    private AdPlanObject adPlanObject;

    void update(AdUnitObject newAdUnitObject) {
        if (null != newAdUnitObject.getUnitId()) {
            this.unitId = newAdUnitObject.getUnitId();
        }
        if (null != newAdUnitObject.getUnitStatus()) {
            this.unitStatus = newAdUnitObject.getUnitStatus();
        }
        if (null != newAdUnitObject.getPositionType()) {
            this.positionType = newAdUnitObject.getPositionType();
        }
        if (null != newAdUnitObject.getPlanId()) {
            this.planId = newAdUnitObject.getPlanId();
        }
        if (null != newAdUnitObject.getAdPlanObject()) {
            this.adPlanObject = newAdUnitObject.getAdPlanObject();
        }
    }
}
