package com.mv.dao;

import com.mv.dynaSql.StudentDynaSqlProvider;
import com.mv.entity.Student;
import org.apache.ibatis.annotations.*;

import java.lang.reflect.Type;
import java.util.List;

public interface StudentMapper {

    @SelectProvider(type = StudentDynaSqlProvider.class, method = "get")
    public Student get(int id);

    @Results({
            @Result(property = "records", javaType = List.class, column = "id",
                    many = @Many(select = "com.mv.dao.Student_RecordMapper.getStuRecore"))
    })
    @SelectProvider(type = StudentDynaSqlProvider.class, method = "list")
    public List<Student> list();

    public List<Student> listPage(@Param("start") int start, @Param("count") int count);

    @InsertProvider(type = StudentDynaSqlProvider.class, method = "insert")
    public int insert();

    @DeleteProvider(type = StudentDynaSqlProvider.class, method = "delete")
    public int delete(int id);

}