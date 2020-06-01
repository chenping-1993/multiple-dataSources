package com.cp.example.multipledatasources.entity.ds1;

import lombok.Data;

import javax.persistence.Table;

/**
 * @Description:
 * @Author: chenping
 * @Date: 2020-05-29
 */
@Data
@Table(name = "people")
public class People {

    private Integer id;

    private String name;
}
