package com.createtom.ad.index.creativeunit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Date: 2019/3/11 16:10
 * Description:
 * Modify:
 *
 * @author huwenjian
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreativeUnitObject {
    /**
     * creative Id
     */
    private Long adId;
    private Long unitId;

    // adId-unitId
}
