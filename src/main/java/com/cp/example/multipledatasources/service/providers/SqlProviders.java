package com.cp.example.multipledatasources.service.providers;

/**
 * @Description:
 * @Author: chenping
 * @Date: 2020-05-29
 */
public class SqlProviders {

    public String getPeopleSql() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" select * from people");
        return stringBuffer.toString();
    }

    public String getGSql() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" select g.user_id as userId,g.follow_user_id as followUserId  from guanz g");
        return stringBuffer.toString();
    }
}
