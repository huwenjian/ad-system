package com.createtom.ad.vo.creativevo;

import com.createtom.ad.constant.CommonStatus;
import com.createtom.ad.entity.Creative;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang.StringUtils;

import java.util.Date;

/**
 * Date: 2019/1/28 11:17
 * Description:
 * Modify:
 *
 * @author huwenjian
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreativeRequest {

    private String name;
    private Integer type;
    private Integer materielType;
    private Integer height;
    private Integer width;
    private Long size;
    private Integer duration;
    private Long userId;
    private String url;

    public boolean validate() {
        return !StringUtils.isEmpty(name)
                && null != userId
                && null != type;
    }

    public Creative convertToEntity() {

        Creative creative = new Creative();
        creative.setName(name);
        creative.setType(type);
        creative.setMaterielType(materielType);
        creative.setHeight(height);
        creative.setWidth(width);
        creative.setSize(size);
        creative.setDuration(duration);
        creative.setAuditStatus(CommonStatus.VALID.getStatus());
        creative.setUserId(userId);
        creative.setUrl(url);
        creative.setCreateTime(new Date());
        creative.setUpdateTime(creative.getCreateTime());

        return creative;
    }
}
