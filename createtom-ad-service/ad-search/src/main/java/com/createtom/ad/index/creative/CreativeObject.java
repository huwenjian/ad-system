package com.createtom.ad.index.creative;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Date: 2019/3/11 15:47
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreativeObject {
    private Long adId;
    private String name;
    private Integer type;
    private Integer materialType;
    private Integer height;
    private Integer width;
    private Integer auditStatus;
    private String adUrl;

    public void update(CreativeObject creativeObject) {
        if (null != creativeObject.getAdId()) {
            this.adId = creativeObject.getAdId();
        }
        if (null != creativeObject.getName()) {
            this.name = creativeObject.getName();
        }
        if (creativeObject.getType() != null) {
            this.type = creativeObject.getType();
        }
        if (creativeObject.getMaterialType() != null) {
            this.materialType = creativeObject.getMaterialType();
        }
        if (creativeObject.getHeight() != null) {
            this.height = creativeObject.getHeight();
        }
        if (creativeObject.width != null) {
            this.width = creativeObject.getWidth();
        }
        if (creativeObject.getAuditStatus() != null) {
            this.auditStatus = creativeObject.getAuditStatus();
        }
        if (creativeObject.getAdUrl() != null) {
            this.adUrl = creativeObject.getAdUrl();
        }

    }
}
