package com.createtom.ad.vo.adplanvo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Date: 2019/1/27 22:52
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdPlanGetRequest {
    private Long userId;
    private List<Long> ids;

    public boolean validate() {

        return userId != null && !CollectionUtils.isEmpty(ids);
    }
}
