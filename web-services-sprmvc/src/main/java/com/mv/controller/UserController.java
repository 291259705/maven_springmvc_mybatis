package com.mv.controller;

import com.mv.dao.StudentMapper;
import com.mv.entity.Student;
import com.mv.inter.UserBase;
import com.mv.utils.MybatisFactory;
import org.apache.ibatis.session.SqlSession;

public class UserController implements UserBase {

    @Override
    public Student getUser(int id) {

        SqlSession session = MybatisFactory.getOpenSession();

        //读取用户信息
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student student = mapper.get(id);

        return student;
    }
}