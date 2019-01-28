package com.createtom.ad.service;

import com.createtom.ad.exception.AdException;
import com.createtom.ad.vo.adunitvo.*;
import com.createtom.ad.vo.creative.CreativeUnitRequest;
import com.createtom.ad.vo.creative.CreativeUnitResponse;

/**
 * Date: 2019/1/28 10:57
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
public interface IAdUnitService {
    AdUnitResponse createUnit(AdUnitRequest request) throws AdException;

    AdUnitKeywordResponse createUnitKeyword(AdUnitKeywordRequest request)
            throws AdException;

    AdUnitItResponse createUnitIt(AdUnitItRequest request)
            throws AdException;

    AdUnitDistrictResponse createUnitDistrict(AdUnitDistrictRequest request)
            throws AdException;

    CreativeUnitResponse createCreativeUnit(CreativeUnitRequest request)
            throws AdException;
}
