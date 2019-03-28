package com.createtom.yulian;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Date: 2019/3/26 17:23
 * Description: 民族品牌相关接口 业务描述
 * Modify:
 *
 * @author huwenjian
 */
@Controller
@RequestMapping("national_brand")
public class BrandController {

    /**
     * 1 获取公司详细信息
     * By sunYi 接口
     */
    public void getCompanyInfo(String companyId) {

    }

    /**
     * 2 获取企业二维码路径
     * desc:
     * 入驻 true: 返回查询公司页面 false:返回手机页面
     * By sunYi 接口
     */
    public void getQrCode(String companyId) {

    }

    /**
     * 3 获取图片和视频
     * desc:
     * xhs_dt_upload_file type:108002 -> Imgs  && type:10083的videos  ps:  大概是取最新的一条
     * xhs_credit_card 获取一个img 和 一个 videoUrl
     * imgs是所有的轮播图
     * --->video 是取一条 优先 xhs_dt_upload_file 的最新的一条
     * 如果没有 则显示xhs_credit_card 的url
     */
    public void getImgAndVideo(String id) {

    }


    /**
     * 4 获取企业官网链接
     * desc:
     * 从xhs_credit_card 获取官网链接   ps: 为什么不从companyInfo表中直接获取呢 或者说companyInfo表中的url可能不太对
     */

    public void getCompanyWebUrl(String id) {

    }

    /**
     * 5 获取企页承诺书
     * desc:
     * 已有 直接拼装在文件服务器中取如果有 则直接返回promiseImage
     * 如果没有 则重新生成放入文件服务器中
     * 需要的参数
     * promiseBG: 背景图地址 filePath:图片存放位置 companyName:公司名 xhCode:新华信用码(Table.XHS_CODE.xh_code) date: 企业入驻时间(XHS_COMPANY_CERTIFICATION.update_time)
     * by fanbingbing
     */
    public void getPromiseImage(String companyId) {

    }

    /**
     * 6 获取评估参数
     * desc:
     * 直接copy过来即可 因为这个是调外部的接口
     * By
     */
    public void getScoringModel(String companyName) {

    }

    /**
     * 7 判断企业是否入驻
     * return: true  入驻 false 非入驻
     * By yuLian
     */
    public static boolean isEnter(String companyId) {
        return true;
    }
}
