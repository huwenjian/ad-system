package com.createtom.ad.vo.adunitvo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
/**
 * Date: 2019/1/28 10:59
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
public class AdUnitKeywordRequest {
    private List<UnitKeyword> unitKeywords;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UnitKeyword {

        private Long unitId;
        private String keyword;
    }
}
