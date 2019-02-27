package com.createtom.ad.controller;

import com.alibaba.fastjson.JSON;
import com.createtom.ad.annotation.IgnoreResponseAdvice;
import com.createtom.ad.client.SponsorClient;
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

    private final SponsorClient sponsorClient;

    @Autowired
    public SearchController(RestTemplate restTemplate, SponsorClient sponsorClient) {
        this.restTemplate = restTemplate;
        this.sponsorClient = sponsorClient;
    }

    /**
     * 基于Feign 实现微服务调用
     */
    @IgnoreResponseAdvice
    @PostMapping("getAdPlans")
    public CommonResponse<List<AdPlan>> getAdPlans(@RequestBody AdPlanGetRequest adPlanGetRequest) {
        log.info("ad-search: getAdPlans -> {}", JSON.toJSONString(adPlanGetRequest));
        return sponsorClient.getAdPlans(adPlanGetRequest);
    }

    /**
     * 基于Ribbon 实现微服务调用
     *
     * @param adPlanGetRequest
     * @return
     */
    @SuppressWarnings("all")
    @IgnoreResponseAdvice
    @PostMapping("getAdPlanByRibbon")
    public CommonResponse<List<AdPlan>> getAdPlanByRebbon(@RequestBody AdPlanGetRequest adPlanGetRequest) {
        log.info("ad-search: getAdPlansByRibbon -> {}", JSON.toJSONString(adPlanGetRequest));

        return restTemplate.postForEntity("http://eureka-client-ad-sponsor/ad-sponsor/get/adPlan", adPlanGetRequest, CommonResponse.class).getBody();
    }


}
