package com.createtom.ad.vo.aduservo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Date: 2019/1/27 22:09
 * Description:
 * Modify:
 *
 * @author huwenjian
 * @// TODO: 2019/1/27 why not use AdUser.Object,why create CreateAdUserResponse.class
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateAdUserResponse {

    private Long userId;
    private String username;
    private String token;
    private Date createTime;
    private Date updateTime;
}
