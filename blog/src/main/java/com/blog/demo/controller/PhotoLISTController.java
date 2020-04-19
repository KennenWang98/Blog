package com.blog.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.blog.demo.entity.PhotoLIST;
import com.blog.demo.service.PhotoLISTService;

@RestController
@RequestMapping(value = "/PhotoLISTController", method = { RequestMethod.GET, RequestMethod.POST })
public class PhotoLISTController {
    @Autowired
    private PhotoLISTService photoLISTservice;

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id) {
        int result = photoLISTservice.delete(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(PhotoLIST photoLIST) {
        int result = photoLISTservice.Update(photoLIST);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }

    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public PhotoLIST insert(PhotoLIST photoLIST) {
        return photoLISTservice.insertPhotoLIST(photoLIST);
    }

    @RequestMapping("/ListPhotoLIST")
    @ResponseBody
    public List<PhotoLIST> ListPhotoLIST(){
        return photoLISTservice.ListPhotoLIST();
    }

    @RequestMapping(value = "/ListPhotoLISTByID",method = RequestMethod.GET)

    public List<PhotoLIST> ListPhotoLISTByID(@RequestParam int id){
        return photoLISTservice.findPhotoLISTByID(id);
    }
}
