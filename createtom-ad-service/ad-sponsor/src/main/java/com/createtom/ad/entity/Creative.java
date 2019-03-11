package com.createtom.ad.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * Date: 2019/1/27 21:23
 * Description: 广告创意表 和 推广单元表 是多对多的关系
 * Modify:
 *
 * @author huwenjian
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "creative_unit")
public class Creative {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * 创意的主类型 视频 图片 等
     */
    @Basic
    @Column(name = "type", nullable = false)
    private Integer type;

    /**
     * 物料的类型, 比如图片可以是 bmp, jpg等等 -> 提供给展示方，被用来选择相应的解析器 视频解析器 图片解析器
     */
    @Basic
    @Column(name = "material_type", nullable = false)
    private Integer materialType;
    /**
     * 物料的高度
     */
    @Basic
    @Column(name = "height", nullable = false)
    private Integer height;
    /**
     * 物料的宽度
     */
    @Basic
    @Column(name = "width", nullable = false)
    private Integer width;

    /**
     * 物料大小
     */
    @Basic
    @Column(name = "size", nullable = false)
    private Long size;

    /**
     * 持续时长, 只有视频不为0
     */
    @Basic
    @Column(name = "duration", nullable = false)
    private Integer duration;

    /**
     * 审核状态 需要运营审核人员来审核物料
     */
    @Basic
    @Column(name = "audit_status", nullable = false)
    private Integer auditStatus;

    @Basic
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Basic
    @Column(name = "url", nullable = false)
    private String url;

    @Basic
    @Column(name = "create_time", nullable = false)
    private Date createTime;

    @Basic
    @Column(name = "updateTime", nullable = false)
    private Date updateTime;

}
