package com.createtom.ad.service;

import com.createtom.ad.exception.AdException;
import com.createtom.ad.vo.creative.CreativeRequest;
import com.createtom.ad.vo.creative.CreativeResponse;

/**
 * Date: 2019/1/28 21:20
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
public interface ICreativeService {
    CreativeResponse createCreative(CreativeRequest creativeRequest) throws AdException;
}
