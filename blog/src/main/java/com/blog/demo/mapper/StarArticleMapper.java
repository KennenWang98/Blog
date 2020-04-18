package com.blog.demo.mapper;

import com.blog.demo.entity.StarArticle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StarArticleMapper {
    List<StarArticle> findStarArticleByID(int id);

    public List<StarArticle> ListStarArticle();

    public int insertStarArticle(StarArticle Stararticle);

    public int delete(int id);

    public int Update(StarArticle articleLIST);
}
