package com.mv.dynaSql;

import com.mv.entity.Category;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

public class CategoryDynaSqlProvider {

    private static final String table="Category";

    public String insert() {
        return new SQL().INSERT_INTO(table).INTO_COLUMNS("name").INTO_VALUES("#{name}").toString();
    }

    public String list() {
        return new SQL().SELECT("*").FROM(table).toString();
    }

    public String get(){
        return new SQL().SELECT("*").FROM(table).WHERE("id=#{id}").toString();
    }
}
