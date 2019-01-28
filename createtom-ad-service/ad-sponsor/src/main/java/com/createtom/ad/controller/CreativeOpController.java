package com.createtom.ad.controller;

import com.alibaba.fastjson.JSON;
import com.createtom.ad.exception.AdException;
import com.createtom.ad.service.ICreativeService;
import com.createtom.ad.vo.creativevo.CreativeRequest;
import com.createtom.ad.vo.creativevo.CreativeResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date: 2019/1/28 22:42
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
@Slf4j
@RestController
public class CreativeOpController {

    private final ICreativeService iCreativeService;

    @Autowired
    public CreativeOpController(ICreativeService iCreativeService) {
        this.iCreativeService = iCreativeService;
    }

    @PostMapping("/create/creative")
    public CreativeResponse createCreative(@RequestBody CreativeRequest request) throws AdException {
        log.info("ad-sponsor: createCreative -> {}", JSON.toJSONString(request));
        return iCreativeService.createCreative(request);
    }
}
