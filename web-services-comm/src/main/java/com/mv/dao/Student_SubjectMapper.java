package com.mv.dao;

import com.mv.entity.Student_Subject;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Student_SubjectMapper {

    @Select("select * from Student_Subject")
    public List<Student_Subject> list();

    /**
     * 根据科目读取得分
     *
     * @return
     */
    @Select("select * from Student_Subject")
    @Results({
            @Result(property = "records", javaType = List.class, column = "id",
                    many = @Many(select = "com.mv.dao.Student_RecordMapper.getSubRecore"))
    })
    public List<Student_Subject> subExaList();

}