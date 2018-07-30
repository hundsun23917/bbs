package com.haut.controller;

import com.haut.bean.User;
import com.haut.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/getUser")
    public ModelAndView  getUser(int id){
        User user = userService.getUserById(id);
        //System.out.println(user.getName());
        ModelAndView mav= new ModelAndView();
        mav.addObject("user",user);
//        mav.addObject("str","String");
        mav.setViewName("success");
        return mav;
    }
    @RequestMapping("/getUserJson")
    @ResponseBody
    public User getUserJson(int id){
        User user = userService.getUserById(id);
        return user;
    }
    @RequestMapping("/getAllUsers")
    @ResponseBody
    public List<User> getAllUsers(){
        List<User> list = userService.getAllUsers();
        for (User user : list){
           // System.out.println(user.getName());
        }
        return list;
    }
    @RequestMapping("/getUserListByPage")
    @ResponseBody
    public List<User> getAllUsersBy(int page,int row){
        List<User> list = userService.getUsersList(page,row);
        return list;
    }
    @RequestMapping("/submit")
    public String  toSubmit(){
        return "submit";
    }
}
