package com.blog.demo.service;

import com.blog.demo.entity.ArticleLIST;
import com.blog.demo.mapper.ArticleLISTMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;

@Service
public class ArticleLISTService {
    @Autowired
    private ArticleLISTMapper articleLISTMapper;

    public List<ArticleLIST> findArticleLISTByID(int id) {
        return articleLISTMapper.findArticleLISTByID(id);
    }

    public ArticleLIST insertArticleLIST(ArticleLIST articleLIST) {
        articleLISTMapper.insertArticleLIST(articleLIST);
        return articleLIST;
    }

    public List<ArticleLIST> ListArticleLIST() {
        return articleLISTMapper.ListArticleLIST();
    }

    public int Update(ArticleLIST articleLIST) {
        return articleLISTMapper.Update(articleLIST);
    }

    public int delete(int id) {
        return articleLISTMapper.delete(id);
    }
}
