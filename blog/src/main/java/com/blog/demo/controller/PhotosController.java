package com.blog.demo.controller;

import java.util.HashMap;
import java.util.List;

import com.blog.demo.entity.Photos;
import com.blog.demo.service.PhotosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/PhotosController", method = { RequestMethod.GET, RequestMethod.POST })
public class PhotosController {
    @Autowired
    private PhotosService photosservice;

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id) {
        int result = photosservice.delete(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(Photos photos) {
        int result = photosservice.Update(photos);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }

    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public Photos insert(Photos photos) {
        return photosservice.insertPhotos(photos);
    }

    @RequestMapping("/ListPhotos")
    @ResponseBody
    public List<Photos> ListPhotos(){
        return photosservice.ListPhotos();
    }

    @RequestMapping(value = "/ListPhotosByListID",method = RequestMethod.GET)
    //@ResponseBody
    public List<Photos> ListPhotosByListID(@RequestParam int list_id){
        return photosservice.findPhotosByListID(list_id);
    }
}
