package com.mv.dao;

import com.mv.entity.Student_Record;
import org.apache.ibatis.annotations.Select;

import java.security.PublicKey;
import java.util.List;

public interface Student_RecordMapper {

    @Select("select * from Student_Record")
    public List<Student_Record> list(int id);

    /**
     *  获取科目分类下的得分情况
     * @param subId
     * @return
     */
    @Select("select sr.*,s.name as stuName,ss.name as subName from student_record sr\n" +
            "left join student s on (sr.stuId=s.id) \n" +
            "left join student_subject ss on (sr.subId=ss.id) \n" +
            "where subId=#{subId} ")
    public List<Student_Record> getSubRecore(int subId);

    /**
     * 获取学生分类下的等分情况
     * @param stuId
     * @return
     */
    @Select("select sr.*,s.name as stuName,ss.name as subName from student_record sr\n" +
            "left join student s on (sr.stuId=s.id) \n" +
            "left join student_subject ss on (sr.subId=ss.id) \n" +
            "where stuId=#{subId} ")
    public List<Student_Record> getStuRecore(int stuId);
}
