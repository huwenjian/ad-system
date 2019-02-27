package com.createtom.ad.client;

import com.createtom.ad.client.vo.AdPlan;
import com.createtom.ad.client.vo.AdPlanGetRequest;
import com.createtom.ad.vo.CommonResponse;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Date: 2019/2/27 15:41
 * Description: 断路器 熔断
 * Modify:
 *
 * @author huwenjian
 */
@Component
public class SponsorClientHystrix implements SponsorClient {

    @Override
    public CommonResponse<List<AdPlan>> getAdPlans(AdPlanGetRequest request) {
        return new CommonResponse<>(-1, "eureka-client-ad-sponsor error");
    }

}
