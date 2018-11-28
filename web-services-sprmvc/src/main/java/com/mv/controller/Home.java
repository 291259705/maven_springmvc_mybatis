package com.mv.controller;

import com.mv.inter.UserBase;
import com.mv.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/home")
public class Home {

    @RequestMapping(value = "/index/{id}", method = RequestMethod.GET)
    public @ResponseBody List<User> index() {

        User u1 = new User();
        u1.setName("老王");
        u1.setId(110);
        u1.setAge(25);

        List<User> users = new ArrayList<>();
        users.add(u1);
        users.add(new User());

        return users;
    }
}
