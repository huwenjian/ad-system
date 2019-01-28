package com.createtom.ad.service.impl;

import com.createtom.ad.constant.Constants;
import com.createtom.ad.dao.CreativeRepository;
import com.createtom.ad.entity.Creative;
import com.createtom.ad.exception.AdException;
import com.createtom.ad.service.ICreativeService;
import com.createtom.ad.vo.creativevo.CreativeRequest;
import com.createtom.ad.vo.creativevo.CreativeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

/**
 * Date: 2019/1/28 21:27
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
public class CreativeServiceImpl implements ICreativeService {

    private final CreativeRepository creativeRepository;

    @Autowired
    public CreativeServiceImpl(CreativeRepository creativeRepository) {
        this.creativeRepository = creativeRepository;
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public CreativeResponse createCreative(CreativeRequest request) throws AdException {


        if (!request.validate()) {
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        Creative oldCreative = creativeRepository.findByName(request.getName());

        if (ObjectUtils.isEmpty(oldCreative)) {
            throw new AdException(Constants.ErrorMsg.SAME_NAME_CREATIVE_ERROR);
        }
        Creative newCreative = creativeRepository.save(
                request.convertToEntity()
        );

        return new CreativeResponse(newCreative.getId(), newCreative.getName());
    }
}
