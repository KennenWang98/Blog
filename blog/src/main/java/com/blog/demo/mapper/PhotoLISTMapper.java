package com.blog.demo.mapper;

import com.blog.demo.entity.PhotoLIST;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PhotoLISTMapper {
    List<PhotoLIST> findPhotoLISTByTitle(String photo_title);

    public List<PhotoLIST> ListPhotoLIST();

    public int insertPhotoLIST(PhotoLIST photoLIST);

    public int delete(int id);

    public int Update(PhotoLIST photoLIST);
}
