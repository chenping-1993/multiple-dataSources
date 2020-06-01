package com.cp.example.multipledatasources.mapper.ds2;

import com.cp.example.multipledatasources.entity.ds2.Guanz;
import com.cp.example.multipledatasources.service.providers.SqlProviders;
import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Description:
 * @Author: chenping
 * @Date: 2020-05-29
 */
public interface GuanzMapper extends Mapper<Guanz> {

    @SelectProvider(type = SqlProviders.class, method = "getGSql")
    List<Guanz> list();

}
