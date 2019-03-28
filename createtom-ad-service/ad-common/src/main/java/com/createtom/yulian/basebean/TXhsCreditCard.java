package com.createtom.yulian.basebean;

/**
 * Date: 2019/3/28 15:57
 * Description: 新华社企业民族品牌
 * Modify:
 *
 * @author huwenjian
 */

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TXhsCreditCard implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 链接
     */
    private String url;

    /**
     * 图片地址
     */
    private String image;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 企业名片序号
     */
    private String cardNo;

    /**
     * 统一社会信用代码
     */
    private String creditCode;

    /**
     * 是否展示
     */
    private String statue;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 公司id
     */
    private String companyId;

    /**
     * 是否展示
     */
    private String showStatus;

    /**
     * 视频链接
     */
    private String videourl;

    /**
     * 企业简介
     */
    private String companySummarize;

    /**
     * 企业简介标题
     */
    private String companySummarizeTitle;



}
