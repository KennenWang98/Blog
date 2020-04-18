package com.blog.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.blog.demo.entity.StarArticle;
import com.blog.demo.service.StarArticleService;

@RestController
@RequestMapping(value = "/StarArticleController", method = { RequestMethod.GET, RequestMethod.POST })
public class StarArticleController {
    @Autowired
    private StarArticleService starArticleservice;

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(int id) {
        int result = starArticleservice.delete(id);
        if (result >= 1) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(StarArticle starArticle) {
        int result = starArticleservice.Update(starArticle);
        if (result >= 1) {
            return "修改成功";
        } else {
            return "修改失败";
        }

    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public StarArticle insert(StarArticle starArticle) {
        return starArticleservice.insertStarArticle(starArticle);
    }

    @RequestMapping("/ListStarArticle")
    @ResponseBody
    public List<StarArticle> ListStarArticle(){
        return starArticleservice.ListStarArticle();
    }

    @RequestMapping(value = "/ListStarArticleByID",method = RequestMethod.GET)
    //@ResponseBody
    public List<StarArticle> ListStarArticleByID(@RequestParam int id){
        return starArticleservice.findStarArticleByID(id);
    }
}
