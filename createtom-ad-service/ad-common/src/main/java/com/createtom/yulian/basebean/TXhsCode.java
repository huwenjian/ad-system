package com.createtom.yulian.basebean;

/**
 * Date: 2019/3/28 15:51
 * Description: 新华信用码表
 * Modify:
 *
 * @author huwenjian
 */

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class TXhsCode implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * 公司id
     */
    private String companyId;

    /**
     * 新华信用码
     */
    private String xhCode;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createDate;

    public TXhsCode() {
    }

}