package com.blog.demo.service;


import com.blog.demo.entity.Photos;
import com.blog.demo.mapper.PhotosMapper;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;

@Service
public class PhotosService {
    @Autowired
    private PhotosMapper photosMapper;

    public List<Photos> findPhotosByListID(int list_id) {
        return photosMapper.findPhotosByListID(list_id);
    }

    public Photos insertPhotos(Photos photos) {
        photosMapper.insertPhotos(photos);
        return photos;
    }

    public List<Photos> ListPhotos() {
        return photosMapper.ListPhotos();
    }

    public int Update(Photos photos) {
        return photosMapper.Update(photos);
    }

    public int delete(int id) {
        return photosMapper.delete(id);
    }
}
