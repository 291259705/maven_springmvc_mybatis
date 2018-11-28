package com.mv.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;

public abstract class BaseDao<T> extends SqlSessionDaoSupport {

    @Autowired
    @Override
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    protected <S> S getMapper(Class<S> clazz) {
        return getSqlSession().getMapper(clazz);
    }

    protected Connection getConnection() {
        return getSqlSession().getConnection();
    }
}
