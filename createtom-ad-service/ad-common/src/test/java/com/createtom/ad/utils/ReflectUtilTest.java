package com.createtom.ad.utils;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Date: 2019/1/28 12:41
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
public class ReflectUtilTest {


    @Test
    public void getNullValueFieldNames() {
    }

    @Test
    public void getNonNullValueFieldNames() {
    }

    @Test
    public void copyPropertiesSimple() {

        TestEntity testEntity = new TestEntity(1l, 1l, "计划名称", 1, new Date(), new Date(), new Date(), new Date());
        TestRequestVo needTestVo = new TestRequestVo();
        ReflectUtil.copyPropertiesSimple(testEntity, needTestVo);

        System.out.println(testEntity);
        System.out.println(needTestVo);

        TestRequestVo resultTestVo = new TestRequestVo(1l, 1l);

        System.out.println(resultTestVo);

        Assert.assertEquals(needTestVo, resultTestVo);

    }

    @Test
    public void copyPropertiesWithIgnoreSourceFields() {
    }

    @Test
    public void copyPropertiesWithNonNullSourceFields() {
    }

    @Test
    public void copyPropertiesWithIgnoreTargetFields() {
    }

    @Test
    public void copyPropertiesWithTargetFieldNonOverwrite() {
    }

    @Test
    public void copyPropertiesWithConditions() {
    }

    @Test
    public void resolveClassFieldMap() {
    }

    @Test
    public void getClassFieldMapWithCache() {
    }

    @Test
    public void resolveArrayToList() {
    }

    @Test
    public void copyObjectProperties() {
    }

    @Test
    public void filterByFieldName() {
    }

    @Test
    public void filterByFieldValue() {
    }
}

