package com.mv.inter;

import com.mv.entity.Student;
import com.mv.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public interface UserBase {

    @RequestMapping(value = "/getUser")
    public Student getUser(int id);

}
