package com.mv.dynaSql;

import com.mv.entity.Student;
import org.apache.ibatis.jdbc.SQL;

public class StudentDynaSqlProvider {

    private static final String mainTableName = "Student";

    public String get() {
        return new SQL().SELECT("*")
                .FROM(mainTableName)
                .WHERE("id=#{id}").toString();

    }

    public String list() {
        return new SQL().SELECT("*").FROM(mainTableName).toString();
    }

    public String delete() {
        return new SQL().DELETE_FROM(mainTableName).WHERE("id=#{id}").toString();
    }

    public String insert() {
        return new SQL().INSERT_INTO(mainTableName)
                .INTO_COLUMNS("name", "age", "qq")
                .INTO_VALUES("#{name}", "#{age}", "#{qq}").toString();
    }
}
