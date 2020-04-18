package com.blog.demo.mapper;

import com.blog.demo.entity.ArticleLIST;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleLISTMapper {
    List<ArticleLIST> findArticleLISTByID(int id);

    public List<ArticleLIST> ListArticleLIST();

    public int insertArticleLIST(ArticleLIST articleLIST);

    public int delete(int id);

    public int Update(ArticleLIST articleLIST);
}
