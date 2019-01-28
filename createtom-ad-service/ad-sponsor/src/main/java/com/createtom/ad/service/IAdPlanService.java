package com.createtom.ad.service;

import com.createtom.ad.entity.AdPlan;
import com.createtom.ad.exception.AdException;
import com.createtom.ad.vo.adplanvo.AdPlanGetRequest;
import com.createtom.ad.vo.adplanvo.AdPlanRequest;
import com.createtom.ad.vo.adplanvo.AdPlanResponse;

import java.util.List;

/**
 * Date: 2019/1/28 10:16
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
public interface IAdPlanService {

    /**
     * <h2>创建推广计划</h2>
     */
    AdPlanResponse createAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>获取推广计划</h2>
     */
    List<AdPlan> getAdPlanByIds(AdPlanGetRequest request) throws AdException;

    /**
     * <h2>更新推广计划</h2>
     */
    AdPlanResponse updateAdPlan(AdPlanRequest request) throws AdException;

    /**
     * <h2>删除推广计划</h2>
     */
    void deleteAdPlan(AdPlanRequest request) throws AdException;
}
