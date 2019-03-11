package com.createtom.ad.index.district;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Date: 2019/3/11 10:11
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UnitDistrictObject {

    private Long unitId;
    private String province;
    private String city;
    // <String,Set<Long>>
    // <province-city,Set<long>>

}
