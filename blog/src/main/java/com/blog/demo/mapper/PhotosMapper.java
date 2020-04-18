package com.blog.demo.mapper;


import com.blog.demo.entity.Photos;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PhotosMapper {
    List<Photos> findPhotosByListID(int list_id);

    public List<Photos> ListPhotos();

    public int insertPhotos(Photos photos);

    public int delete(int id);

    public int Update(Photos photos);
}
