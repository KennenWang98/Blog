package com.blog.demo.mapper;

import com.blog.demo.entity.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {
    List<Message> findMessageByName(String name);

    public List<Message> ListMessage();

    public int insertMessage(Message message);

    public int delete(int id);

    public int Update(Message message);
}
