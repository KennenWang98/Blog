package com.blog.demo.service;

import com.blog.demo.entity.StarArticle;
import com.blog.demo.mapper.StarArticleMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;

@Service
public class StarArticleService {
    @Autowired
    private StarArticleMapper starArticleMapper;

    public List<StarArticle> findStarArticleByID(int id) {
        return starArticleMapper.findStarArticleByID(id);
    }

    public StarArticle insertStarArticle(StarArticle starArticle) {
        starArticleMapper.insertStarArticle(starArticle);
        return starArticle;
    }

    public List<StarArticle> ListStarArticle() {
        return starArticleMapper.ListStarArticle();
    }

    public int Update(StarArticle articleLIST) {
        return starArticleMapper.Update(articleLIST);
    }

    public int delete(int id) {
        return starArticleMapper.delete(id);
    }
}
