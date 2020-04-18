package com.blog.demo.mapper;

import com.blog.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Mapper
public interface UserMapper {

    List<User> findUserByName(String username);

    public List<User> ListUser();

    public int insertUser(User user);

    public int delete(int id);

    public int Update(User user);

    public String CheckLogin(String username,String password);
}
