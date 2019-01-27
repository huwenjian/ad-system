package com.createtom.ad.entity;

import com.createtom.ad.constant.CommonStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * Date: 2019/1/27 11:45
 * Description: da_user  table
 * Modify:
 *
 * @author huwenjian
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_user")
public class AdUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "username")
    private String username;

    @Basic
    @Column(name = "token", nullable = false)
    private String token;

    @Basic
    @Column(name = "userStatus", nullable = false)
    private Integer userStatus;

    @Basic
    @Column(name = "createTime", nullable = false)
    private Date createTime;

    @Basic
    @Column(name = "updateTime", nullable = false)
    private Date updateTime;

    public AdUser(String username, String token) {
        this.username = username;
        this.token = token;
        this.userStatus = CommonStatus.VALID.getStatus();
        this.updateTime = this.createTime;
    }
}
