package com.createtom.ad.controller;

import com.alibaba.fastjson.JSON;
import com.createtom.ad.entity.AdPlan;
import com.createtom.ad.exception.AdException;
import com.createtom.ad.service.IAdPlanService;
import com.createtom.ad.vo.adplanvo.AdPlanGetRequest;
import com.createtom.ad.vo.adplanvo.AdPlanRequest;
import com.createtom.ad.vo.adplanvo.AdPlanResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Date: 2019/1/28 22:22
 * Description:
 * Modify:
 *
 * @author huwenjian
 */

@Slf4j
@RestController
public class AdPlanOpController {

    private final IAdPlanService adPlanService;

    @Autowired
    public AdPlanOpController(IAdPlanService adPlanService) {
        this.adPlanService = adPlanService;
    }

    @PostMapping("/create/adPlan")
    public AdPlanResponse createAdPlan(@RequestBody AdPlanRequest request) throws AdException {

        log.info("ad-sponsor: createAdPlan -> {}", JSON.toJSONString(request));

        return adPlanService.createAdPlan(request);
    }

    @PostMapping("/get/adPlan")
    public List<AdPlan> getAdPlanByIds(@RequestBody AdPlanGetRequest request) throws AdException {

        log.info("ad-sponsor: getAdPlanByIds -> {}", JSON.toJSONString(request));

        return adPlanService.getAdPlanByIds(request);
    }

    @PutMapping("/update/adPlan")
    public AdPlanResponse updateAdPlan(@RequestBody AdPlanRequest request) throws AdException {

        log.info("ad-sponsor: updateAdPlan -> {}", JSON.toJSONString(request));

        return adPlanService.updateAdPlan(request);
    }

    @DeleteMapping("/delete/adPlan")
    public void deleteAdPlan(@RequestBody AdPlanRequest request) throws AdException {

        log.info("ad-sponsor: deleteAdPlan -> {}", JSON.toJSONString(request));

        adPlanService.deleteAdPlan(request);
    }
}
