package com.createtom.yulian;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.List;

/**
 * Date: 2019/3/28 15:59
 * Description: 返回接口封装
 * Modify:
 *
 * @author huwenjian
 */
@Data
public class BrandVO {


    /**
     * 企业承诺书地址
     */
    public String promiseImageUrl = "http://www.credit100.com/xinhuashe/credentials/promise/贵州茅台酒股份有限公司.jpg";

    /**
     * 获取评估参数模型 json
     */
    public JSONObject scoringModel;

    /**
     * 企业LOGO url 地址
     * XHS_DT_UPLOAD_FILE.type = 103001 --> XHS_DT_UPLOAD_FILE.path
     */
    public String companyLogoUrl;

    /**
     * 企业名字
     */
    public String companyName;


    /**
     * 统一社会信用代码
     */
    public String creditCode;

    /**
     * 法人代表
     */
    public String operaName;

    /**
     * 所属行业
     */
    public String industry;

    /**
     * 主营业务
     */
    public String scope;

    /**
     * 成立日期
     */
    public String createTime;

    /**
     * 二维码图片地址
     */
    public String QrCode;

    /**
     * 官网地址
     */
    public String website;

    /**
     * 公司所有图片
     */
    public List allImg;

    /**
     * 公司所有视频
     */
    public List allVideo;

    /**
     * 是否入驻
     * 状态为3  代表入驻
     */
    public String isEnter;




}
