package com.blog.demo.controller;

import java.sql.Array;
import java.util.*;

import com.blog.demo.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.blog.demo.entity.User;
import com.blog.demo.service.UserService;


@RestController
@RequestMapping(value = "/UserController", method = { RequestMethod.GET, RequestMethod.POST })
public class UserController {
    @Autowired
    private UserService userservice;

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id) {
        int result = userservice.delete(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(User user) {
        int result = userservice.Update(user);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }

    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public User insert(User user) {
        return userservice.insertUser(user);
    }

    @RequestMapping("/ListUser")
    @ResponseBody
    public List<User> ListUser(){
        return userservice.ListUser();
    }

    @RequestMapping("/ListUserByName")
    @ResponseBody
    public List<User> ListUserByName(String username){
        return userservice.findByName(username);
    }

    @RequestMapping(value = "/ListUserJSON",method = RequestMethod.GET)
    @ResponseBody
    public JSONResult ListUserJSON(){
        return JSONResult.ok(userservice.ListUser());
    }

    @RequestMapping(value = "/CheckLogin",method = RequestMethod.POST)
    @ResponseBody
    public JSONResult CheckLogin(String username,String password){
        List<User> user_db= userservice.findByName(username);
        if(user_db.get(0).getPassword().equals(password)) {
            return JSONResult.ok("Pass");
        }
        return JSONResult.errorMsg("密码错误");
    }

}
