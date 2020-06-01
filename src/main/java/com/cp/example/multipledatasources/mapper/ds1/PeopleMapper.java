package com.cp.example.multipledatasources.mapper.ds1;

import com.cp.example.multipledatasources.entity.ds1.People;
import com.cp.example.multipledatasources.service.providers.SqlProviders;
import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Description:
 * @Author: chenping
 * @Date: 2020-05-29
 */
public interface PeopleMapper extends Mapper<People> {

    @SelectProvider(type = SqlProviders.class, method = "getPeopleSql")
    List<People> list();
}
