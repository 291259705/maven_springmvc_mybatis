package com.mv.utils;

import com.mv.entity.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.Null;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.lang.model.type.NullType;
import java.io.InputStream;

public class DateUtil {

    public static void main(String[] args) {

        try {

            SqlSession session = MybatisFactory.getOpenSession();

            String statement = "com.mv.dao.EmployeeMapper.selectByPrimaryKey";

            //新增数据行
            long id = 1234567891025657l;
            Employee result = session.selectOne(statement, id);
            System.out.println("Result: " + result);
            System.out.println(result.getName());

            //插入数据行
            result = new Employee();
            result.setName("洋洋");
            result.setAge(26);

            statement = "com.mv.dao.EmployeeMapper.insert";
            result = session.selectOne(statement, result);
            System.out.println(result);


        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}