package com.mv.controller;

import com.mv.dao.StudentMapper;
import com.mv.entity.Student;
import com.mv.utils.MybatisFactory;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
public class StudentController {

    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Student get() {
        SqlSession session = MybatisFactory.getOpenSession();

        //读取用户信息
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student student = mapper.get(1);

        return student;
    }

}
