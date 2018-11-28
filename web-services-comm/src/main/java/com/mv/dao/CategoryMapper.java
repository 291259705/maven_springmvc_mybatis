package com.mv.dao;

import com.mv.dynaSql.CategoryDynaSqlProvider;
import com.mv.entity.Category;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

@Mapper
public interface CategoryMapper {

    @InsertProvider(type = CategoryDynaSqlProvider.class, method = "insert")
    public int insert(Category category);

    @SelectProvider(type = CategoryDynaSqlProvider.class, method = "list")
    public List<Category> list();

    @SelectProvider(type = CategoryDynaSqlProvider.class, method = "get")
    public Category get(int id);
}
