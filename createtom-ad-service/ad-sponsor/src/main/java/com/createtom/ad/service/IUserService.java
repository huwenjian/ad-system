package com.createtom.ad.service;

import com.createtom.ad.exception.AdException;
import com.createtom.ad.vo.CreateUserRequest;
import com.createtom.ad.vo.CreateUserResponse;

/**
 * Date: 2019/1/27 22:04
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
public interface IUserService {

    /**
     * <h2>创建用户</h2>
     */
    CreateUserResponse createUser(CreateUserRequest request) throws AdException;
}
