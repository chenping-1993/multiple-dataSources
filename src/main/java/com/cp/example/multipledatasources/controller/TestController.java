package com.cp.example.multipledatasources.controller;

import com.cp.example.multipledatasources.mapper.ds1.PeopleMapper;
import com.cp.example.multipledatasources.mapper.ds2.GuanzMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: chenping
 * @Date: 2020-05-29
 */
@RestController
public class TestController {

    @Autowired
    PeopleMapper peopleMapper;

    @Autowired
    GuanzMapper guanzMapper;

    //测试ds1数据库
    @RequestMapping("testDatabase1")
    public Object testDatabase1() {
        return peopleMapper.list();
    }

    //测试ds2数据库
    @RequestMapping("testDatabase2")
    public Object testDatabase2() {
        return guanzMapper.list();
    }

    //测试 tkmybatis
    @RequestMapping("testTkDatabase")
    public Object testDatabase3() {
        return guanzMapper.selectAll();
    }
}
