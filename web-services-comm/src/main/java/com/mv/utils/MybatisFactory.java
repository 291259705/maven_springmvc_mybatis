package com.mv.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisFactory {

    private final static String configPath = "mybatis-config.xml";

    /**
     * 获取openSession
     *
     * @return SqlSession实例
     */
    public static SqlSession getOpenSession() {
        try {
            InputStream stream = Resources.getResourceAsStream(configPath);
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);

            return factory.openSession();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}