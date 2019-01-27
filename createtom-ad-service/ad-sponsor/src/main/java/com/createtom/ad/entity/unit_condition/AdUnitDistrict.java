package com.createtom.ad.entity.unit_condition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Date: 2019/1/27 21:18
 * Description: 推广地域限制表
 * Modify:
 *
 * @author huwenjian
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_unit_district")
public class AdUnitDistrict {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "unit_id", nullable = false)
    private Long unitId;

    @Basic
    @Column(name = "province", nullable = false)
    private String province;

    @Basic
    @Column(name = "city", nullable = false)
    private String city;

    @Basic
    @Column(name = "county", nullable = false)
    private String county;


    public AdUnitDistrict(Long unitId, String province, String city, String county) {
        this.unitId = unitId;
        this.province = province;
        this.city = city;
        this.county = county;
    }

}
