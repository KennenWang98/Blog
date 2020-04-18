package com.blog.demo.controller;

import java.util.List;

import com.blog.demo.entity.User;
import com.blog.demo.util.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.blog.demo.entity.Message;
import com.blog.demo.service.MessageService;

@RestController
@RequestMapping(value = "/MessageController", method = { RequestMethod.GET, RequestMethod.POST })
public class MessageController {
    @Autowired
    private MessageService messageservice;

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id) {
        int result = messageservice.delete(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(Message message) {
        int result = messageservice.Update(message);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }

    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public JSONResult insert(Message message) {
        messageservice.insertMessage(message);
        return JSONResult.ok("添加留言成功");
    }

//    @RequestMapping("/ListMessage")
//    @ResponseBody
//    public List<Message> ListMessage(){
//        return messageservice.ListMessage();
//    }

    @RequestMapping("/ListMessageByName")
    @ResponseBody
    public List<Message> ListMessageByName(String name){
        return messageservice.findByName(name);
    }

    @RequestMapping(value = "/ListMessage",method = RequestMethod.GET)
    @ResponseBody
    public JSONResult ListMessage(){
            return JSONResult.ok(messageservice.ListMessage());
    }
}
