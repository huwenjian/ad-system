package com.createtom.ad.service;

import com.createtom.ad.exception.AdException;
import com.createtom.ad.vo.creativevo.CreativeRequest;
import com.createtom.ad.vo.creativevo.CreativeResponse;

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
