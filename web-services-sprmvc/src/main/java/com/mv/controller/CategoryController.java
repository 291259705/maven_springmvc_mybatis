package com.mv.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mv.entity.Category;
import com.mv.model.Page;
import com.mv.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @ResponseBody
    @RequestMapping("/list")
    public List<Category> list() {
        List<Category> cs = categoryService.list();

        return cs;
    }

    @RequestMapping("/page")
    public String index(Page page) {

        ModelAndView mav = new ModelAndView();
        PageHelper.offsetPage(page.getStart(), 5);
        List<Category> cs = categoryService.list();
        int totle = (int) new PageInfo<>(cs).getTotal();
        page.setTotal(totle);

        return "forward:/WEB-INF/jsp/category/index.jsp";
    }

}
