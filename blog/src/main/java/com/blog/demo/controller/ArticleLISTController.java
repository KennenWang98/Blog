package com.blog.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.blog.demo.entity.ArticleLIST;
import com.blog.demo.service.ArticleLISTService;

@RestController
@RequestMapping(value = "/ArticleLISTController", method = { RequestMethod.GET, RequestMethod.POST })
public class ArticleLISTController {
    @Autowired
    private ArticleLISTService articleLISTservice;

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id) {
        int result = articleLISTservice.delete(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(ArticleLIST articleLIST) {
        int result = articleLISTservice.Update(articleLIST);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }

    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ArticleLIST insert(ArticleLIST articleLIST) {
        return articleLISTservice.insertArticleLIST(articleLIST);
    }

    @RequestMapping("/ListArticleLIST")
    @ResponseBody
    public List<ArticleLIST> ListArticleLIST(){
        return articleLISTservice.ListArticleLIST();
    }

    @RequestMapping(value = "/ListArticleLISTByID",method = RequestMethod.GET)
    //@ResponseBody
    public List<ArticleLIST> ListArticleLISTByID(@RequestParam int id){
        return articleLISTservice.findArticleLISTByID(id);
    }
}
