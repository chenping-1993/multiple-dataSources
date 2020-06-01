package com.cp.example.multipledatasources.entity.ds2;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @Description:
 * @Author: chenping
 * @Date: 2020-05-29
 */
@Data
@Table(name = "guanz")
public class Guanz {

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "follow_user_id")
    private Integer followUserId;
}
