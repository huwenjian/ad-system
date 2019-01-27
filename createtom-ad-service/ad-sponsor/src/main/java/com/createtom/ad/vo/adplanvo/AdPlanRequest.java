package com.createtom.ad.vo.adplanvo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

/**
 * Date: 2019/1/27 22:47
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanRequest {
    private Long id;
    private Long userId;
    private String planName;
    private String startDate;
    private String endDate;

    public boolean createValidate() {

        return userId != null
                && !StringUtils.isEmpty(planName)
                && !StringUtils.isEmpty(startDate)
                && !StringUtils.isEmpty(endDate);
    }

    public boolean updateValidate() {

        return id != null && userId != null;
    }

    public boolean deleteValidate() {

        return id != null && userId != null;
    }
}
