package com.createtom.ad.index.adplan;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Date: 2019/2/28 15:20
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanObject {
    private Long planId;
    private Long userId;
    private Integer planStatus;
    private Date startDate;
    private Date endDate;

    public void update(AdPlanObject adPlanObject) {

        if (null != adPlanObject.getPlanId()) {
            this.planId = adPlanObject.getPlanId();
        }
        if (null != adPlanObject.getUserId()) {
            this.userId = adPlanObject.getUserId();
        }
        if (null != adPlanObject.getPlanStatus()) {
            this.planStatus = adPlanObject.getPlanStatus();
        }
        if (null != adPlanObject.getStartDate()) {
            this.startDate = adPlanObject.getStartDate();
        }
        if (null != adPlanObject.getEndDate()) {
            this.endDate = adPlanObject.getEndDate();
        }
    }
}
