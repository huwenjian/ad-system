package com.createtom.ad.controller;

import com.alibaba.fastjson.JSON;
import com.createtom.ad.annotation.IgnoreResponseAdvice;
import com.createtom.ad.client.vo.AdPlan;
import com.createtom.ad.client.vo.AdPlanGetRequest;
import com.createtom.ad.vo.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Date: 2019/2/27 15:45
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
@Slf4j
@RestController
public class SearchController {

    private final RestTemplate restTemplate;

    @Autowired
    public SearchController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @SuppressWarnings("all")
    @IgnoreResponseAdvice
    @PostMapping("getAdPlanByRibbon")
    public CommonResponse<List<AdPlan>> getAdPlanByRebbon(@RequestBody AdPlanGetRequest adPlanGetRequest) {
        log.info("ad-search: getAdPlansByRibbon -> {}", JSON.toJSONString(adPlanGetRequest));

        return restTemplate.postForEntity("http://eureka-client-ad-sponsor/ad-sponsor/get/adPlan",adPlanGetRequest,CommonResponse.class).getBody();
    }


}
