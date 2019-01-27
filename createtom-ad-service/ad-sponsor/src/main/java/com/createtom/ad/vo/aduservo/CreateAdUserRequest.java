package com.createtom.ad.vo.aduservo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;

/**
 * Date: 2019/1/27 22:07
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateAdUserRequest {

    private String username;

    public boolean validate() {

        return !StringUtils.isEmpty(username);
    }
}
