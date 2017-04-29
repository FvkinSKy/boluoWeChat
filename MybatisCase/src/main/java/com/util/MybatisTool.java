package com.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by rui on 2017/4/28.
 * Mybatis工具类
 */
public class MybatisTool {
    public static SqlSession getSession() {
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        String conf = "SqlMapConfig.xml";
        SqlSession session = null;
        try {
            Reader reader =
                    Resources.getResourceAsReader(conf);
            SqlSessionFactory factory = builder.build(reader);
            session = factory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return session;
    }
}
