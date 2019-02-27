package com.createtom.ad.client;

import com.createtom.ad.client.vo.AdPlan;
import com.createtom.ad.client.vo.AdPlanGetRequest;
import com.createtom.ad.vo.CommonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Date: 2019/2/27 15:41
 * Description: 如果出错 服务降级到 SponsorClientHystrix.class
 * Modify:
 *
 * @author huwenjian
 */
@FeignClient(value = "eureka-client-ad-sponsor", fallback = SponsorClientHystrix.class)
public interface SponsorClient {

    @RequestMapping(value = "/ad-sponsor/get/adPlan", method = RequestMethod.POST)
    CommonResponse<List<AdPlan>> getAdPlans(@RequestBody AdPlanGetRequest request);
}
