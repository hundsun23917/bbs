package com.haut.controller;

import com.haut.bean.User;
import com.haut.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/getUser")
    public ModelAndView  getUser(int id){
        User user = userService.getUserById(id);
        System.out.println(user.getName());
        ModelAndView mav= new ModelAndView();
        mav.addObject("user",user);
//        mav.addObject("str","String");
        mav.setViewName("success");
        return mav;
    }
}
