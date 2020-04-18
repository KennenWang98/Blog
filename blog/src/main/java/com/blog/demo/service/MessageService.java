package com.blog.demo.service;

import com.blog.demo.entity.Message;
import com.blog.demo.mapper.MessageMapper;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;

@Service
public class MessageService {
    @Autowired
    private MessageMapper messageMapper;

    public List<Message> findByName(String name) {
        return messageMapper.findMessageByName(name);
    }

    public Message insertMessage(Message message) {
        messageMapper.insertMessage(message);
        return message;
    }

    public List<Message> ListMessage() {
        return messageMapper.ListMessage();
    }

    public int Update(Message message) {
        return messageMapper.Update(message);
    }

    public int delete(int id) {
        return messageMapper.delete(id);
    }
}
