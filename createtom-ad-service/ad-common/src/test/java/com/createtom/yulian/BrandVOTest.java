package com.createtom.yulian;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 2019/3/28 16:45
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
public class BrandVOTest {

    @Test
    public void createBrandVOInfo() {
        BrandVO brandVO = new BrandVO();

        brandVO.setPromiseImageUrl("http://www.credit100.com/xinhuashe/credentials/promise/贵州茅台酒股份有限公司.jpg");

        brandVO.setScoringModel(JSON.parseObject(scoringModel));

        brandVO.setCompanyLogoUrl("http://www.credit100.com/assets/images/xhxyLOGO.png");

        brandVO.setCompanyName("贵州茅台酒股份有限公司 ");

        brandVO.setCreditCode("9152000071430580XT");

        brandVO.setOperaName("李保芳");

        brandVO.setIndustry("制造业");

        brandVO.setScope("法律、法规、国务院决定规定禁止的不得经营;法律、法规、国务院决定规定应当许可(审批)的,经审批机关批准后凭许可..");

        brandVO.setCreateTime("1999-11-20");

        brandVO.setQrCode("http://www.credit100.com/xinhuashe/qrcode/贵州茅台酒股份有限公司.jpg");

        brandVO.setWebsite("http://www.moutaichina.com/");

        List allImg = new ArrayList();
        allImg.add("http://www.credit100.com/xinhuashe/waframework/upload/temp/b9052567-90ef-4ca3-a0f3-6e480ef6615c.jpg");
        allImg.add("http://www.credit100.com/xinhuashe/waframework/upload/temp/913d5a46-4c01-40ac-aae3-cb8405505a35.jpg");
        allImg.add("http://www.credit100.com/xinhuashe/waframework/upload/temp/a0b864fa-ef4c-4d12-bad6-70f56ed7e2e9.jpg");
        allImg.add("");
        brandVO.setAllImg(allImg);

        List allVideo = new ArrayList();
        allVideo.add("http://www.credit100.com/xinhuashe/waframework/upload/temp/5e86fc62-e12e-4e5c-9c62-0dfe40b0dd89.mp4");
        allVideo.add("第二个不作为显示吧");
        brandVO.setAllVideo(allVideo);

        brandVO.setIsEnter("3");

        System.out.println(JSON.toJSON(brandVO));

    }


    static String scoringModel = "{\n" +
            "    \"e9score\": \"较强\",\n" +
            "    \"E13WEIGTH\": \"2.00%\",\n" +
            "    \"E16WEIGTH\": \"3.00%\",\n" +
            "    \"E6WEIGTH\": \"2.00%\",\n" +
            "    \"pdUb\": \"0.06%\",\n" +
            "    \"e4score\": \"最强\",\n" +
            "    \"e8score\": \"最强\",\n" +
            "    \"e16score\": \"一般\",\n" +
            "    \"E3WEIGTH\": \"1.00%\",\n" +
            "    \"e10score\": \"最强\",\n" +
            "    \"chartQualRatingArr\": [\n" +
            "        1,\n" +
            "        0,\n" +
            "        0,\n" +
            "        0,\n" +
            "        0,\n" +
            "        0,\n" +
            "        0,\n" +
            "        0,\n" +
            "        1,\n" +
            "        1,\n" +
            "        1,\n" +
            "        1,\n" +
            "        1,\n" +
            "        1,\n" +
            "        1,\n" +
            "        1,\n" +
            "        1,\n" +
            "        1,\n" +
            "        1,\n" +
            "        1,\n" +
            "        1,\n" +
            "        1,\n" +
            "        1,\n" +
            "        1\n" +
            "    ],\n" +
            "    \"E10WEIGTH\": \"6.00%\",\n" +
            "    \"E2WEIGTH\": \"10.00%\",\n" +
            "    \"lineEchatMonthsList\": [\n" +
            "        \"201703\",\n" +
            "        \"201704\",\n" +
            "        \"201705\",\n" +
            "        \"201706\",\n" +
            "        \"201707\",\n" +
            "        \"201708\",\n" +
            "        \"201709\",\n" +
            "        \"201710\",\n" +
            "        \"201711\",\n" +
            "        \"201712\",\n" +
            "        \"201801\",\n" +
            "        \"201802\",\n" +
            "        \"201803\",\n" +
            "        \"201804\",\n" +
            "        \"201805\",\n" +
            "        \"201806\",\n" +
            "        \"201807\",\n" +
            "        \"201808\",\n" +
            "        \"201809\",\n" +
            "        \"201810\",\n" +
            "        \"201811\",\n" +
            "        \"201812\",\n" +
            "        \"201901\",\n" +
            "        \"201902\"\n" +
            "    ],\n" +
            "    \"E9WEIGTH\": \"4.00%\",\n" +
            "    \"e12score\": \"较强\",\n" +
            "    \"month\": \"201902\",\n" +
            "    \"e15score\": \"最强\",\n" +
            "    \"E14WEIGTH\": \"14.00%\",\n" +
            "    \"e3score\": \"较强\",\n" +
            "    \"pdLb\": \"0.00%\",\n" +
            "    \"e6score\": \"最强\",\n" +
            "    \"desc\": \"总体上，该公司最好的信用评级等级，具有最好的信用质量。<br /><br />该公司外部环境存在一定的不稳定性，行业或区域风险相对稍高；<br /><br />该公司企业特质优秀，具有较低的信用风险；<br /><br />该公司股东背景较强，表现出较低的信用风险；<br /><br />该公司具有较强的经营水平和财务水平，表现出较低的信用风险；<br /><br />该公司具有良好的信用历史，经营规范，无不良融资记录和信用表现，表现出较低的信用风险；<br /><br />该公司利益关联方具有优秀的信用表现，利益关联方表现出较强的经营水平和财务水平以及良好的信用记录，表现出较低的信用风险。<br /><br />\",\n" +
            "    \"E8WEIGTH\": \"25.00%\",\n" +
            "    \"e11\": 75,\n" +
            "    \"E11WEIGTH\": \"7.00%\",\n" +
            "    \"e10\": 86,\n" +
            "    \"e13\": 80,\n" +
            "    \"e12\": 75,\n" +
            "    \"e15\": 99,\n" +
            "    \"e14\": 93,\n" +
            "    \"E1WEIGTH\": \"10.00%\",\n" +
            "    \"e16\": 65,\n" +
            "    \"d1\": 52,\n" +
            "    \"d2\": 93,\n" +
            "    \"d3\": 88,\n" +
            "    \"E5WEIGTH\": \"3.00%\",\n" +
            "    \"d4\": 89,\n" +
            "    \"E15WEIGTH\": \"8.00%\",\n" +
            "    \"e1score\": \"一般\",\n" +
            "    \"d5\": 75,\n" +
            "    \"d6\": 99,\n" +
            "    \"e7score\": \"较强\",\n" +
            "    \"entname\": \"贵州茅台酒股份有限公司\",\n" +
            "    \"e13score\": \"较强\",\n" +
            "    \"ratingdes\": \"最好的信用评级等级，具有最好的信用质量。\",\n" +
            "    \"E12WEIGTH\": \"1.00%\",\n" +
            "    \"e11score\": \"较强\",\n" +
            "    \"comppdratio\": \"0.03%\",\n" +
            "    \"e5score\": \"最强\",\n" +
            "    \"e1\": 62,\n" +
            "    \"e2\": 42,\n" +
            "    \"e14score\": \"最强\",\n" +
            "    \"e3\": 75,\n" +
            "    \"e4\": 91,\n" +
            "    \"e2score\": \"最弱\",\n" +
            "    \"e5\": 89,\n" +
            "    \"e6\": 88,\n" +
            "    \"e7\": 77,\n" +
            "    \"e8\": 89,\n" +
            "    \"e9\": 82,\n" +
            "    \"E4WEIGTH\": \"2.00%\",\n" +
            "    \"qualratingnm\": \"R1\",\n" +
            "    \"E7WEIGTH\": \"2.00%\"\n" +
            "}";
}