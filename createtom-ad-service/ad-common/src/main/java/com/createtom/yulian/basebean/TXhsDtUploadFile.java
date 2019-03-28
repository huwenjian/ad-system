package com.createtom.yulian.basebean;

/**
 * Date: 2019/3/28 15:53
 * Description: 附件表
 * Modify:
 *
 * @author huwenjian
 */

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TXhsDtUploadFile implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;

    /**
     * 文件名称
     */
    private String name;

    /**
     * 文件路径
     */
    private String path;

    /**
     * 文件图标
     */
    private String icon;

    /**
     * 业务主键
     */
    private String businessId;

    /**
     * 文件类型
     */
    private String type;

    /**
     * 文件顺序
     */
    private String sort;

    /**
     * 创建人
     */
    private String createId;

    /**
     * create_time
     */
    private Date createTime;

    /**
     * upload_date
     */
    private Date uploadDate;

    /**
     * 点击图片跳转地址
     */
    private String url;

    /**
     * 图片需要展示的标题
     */
    private String title;


}
