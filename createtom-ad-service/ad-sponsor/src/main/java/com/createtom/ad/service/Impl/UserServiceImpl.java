package com.createtom.ad.service.Impl;

import com.createtom.ad.constant.Constants;
import com.createtom.ad.dao.AdUserRepository;
import com.createtom.ad.entity.AdUser;
import com.createtom.ad.exception.AdException;
import com.createtom.ad.service.IUserService;
import com.createtom.ad.utils.CommonUtils;
import com.createtom.ad.vo.CreateUserRequest;
import com.createtom.ad.vo.CreateUserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Date: 2019/1/27 22:11
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    private final AdUserRepository userRepository;

    @Autowired
    public UserServiceImpl(AdUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * https://www.cnblogs.com/clwydjgs/p/9317849.html
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public CreateUserResponse createUser(CreateUserRequest request)
            throws AdException {

        if (!request.validate()) {
            throw new AdException(Constants.ErrorMsg.REQUEST_PARAM_ERROR);
        }

        AdUser oldUser = userRepository.
                findByUsername(request.getUsername());
        if (oldUser != null) {
            throw new AdException(Constants.ErrorMsg.SAME_NAME_ERROR);
        }

        AdUser newUser = userRepository.save(new AdUser(
                request.getUsername(),
                CommonUtils.md5(request.getUsername())
        ));

        return new CreateUserResponse(
                newUser.getId(), newUser.getUsername(), newUser.getToken(),
                newUser.getCreateTime(), newUser.getUpdateTime()
        );
    }
}
