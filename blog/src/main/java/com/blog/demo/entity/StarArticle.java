package com.blog.demo.entity;

public class StarArticle {
    private int id;
    private String title;
    private int article_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    @Override
    public String toString() {
        return "StarArticle{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", article_id=" + article_id +
                '}';
    }
}
