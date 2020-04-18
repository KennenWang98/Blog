package com.blog.demo.service;

import com.blog.demo.entity.User;
import com.blog.demo.mapper.UserMapper;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findByName(String username) {
        return userMapper.findUserByName(username);
    }

    public User insertUser(User user) {
        userMapper.insertUser(user);
        return user;
    }

    public List<User> ListUser() {
        return userMapper.ListUser();
    }

    public int Update(User user) {
        return userMapper.Update(user);
    }

    public int delete(int id) {
        return userMapper.delete(id);
    }

}
