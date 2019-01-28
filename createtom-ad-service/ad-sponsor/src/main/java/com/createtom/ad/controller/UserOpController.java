package com.createtom.ad.controller;

import com.alibaba.fastjson.JSON;
import com.createtom.ad.exception.AdException;
import com.createtom.ad.service.IUserService;
import com.createtom.ad.vo.aduservo.CreateAdUserRequest;
import com.createtom.ad.vo.aduservo.CreateAdUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Date: 2019/1/28 22:20
 * Description:
 * Modify:
 *
 * @author huwenjian
 */

@Slf4j
@RestController
public class UserOpController {

    private final IUserService userService;

    @Autowired
    public UserOpController(IUserService userService) {
        this.userService = userService;
    }


    @PostMapping("/create/user")
    public CreateAdUserResponse createUser(@RequestBody CreateAdUserRequest request) throws AdException {

        log.info("ad-sponsor: createUser -> {}", JSON.toJSONString(request));
        return userService.createUser(request);
    }
}
