package com.blog.demo.service;

import com.blog.demo.entity.PhotoLIST;
import com.blog.demo.mapper.PhotoLISTMapper;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;

@Service
public class PhotoLISTService {
    @Autowired
    private PhotoLISTMapper photoLISTMapper;

    public List<PhotoLIST> findPhotoLISTByID(int id) {
        return photoLISTMapper.findPhotoLISTByID(id);
    }

    public PhotoLIST insertPhotoLIST(PhotoLIST photoLIST) {
        photoLISTMapper.insertPhotoLIST(photoLIST);
        return photoLIST;
    }

    public List<PhotoLIST> ListPhotoLIST() {
        return photoLISTMapper.ListPhotoLIST();
    }

    public int Update(PhotoLIST photoLIST) {
        return photoLISTMapper.Update(photoLIST);
    }

    public int delete(int id) {
        return photoLISTMapper.delete(id);
    }
}
