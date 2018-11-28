package com.mv.impl;

import com.mv.dao.CategoryMapper;
import com.mv.entity.Category;
import com.mv.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public class CategoryServiceImpl extends BaseDao implements CategoryService {

    @Autowired
    CategoryMapper mapper;

    @Override
    public List<Category> list() {
        return mapper.list();
    }
}
