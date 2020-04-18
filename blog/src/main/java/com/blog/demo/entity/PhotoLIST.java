package com.blog.demo.entity;

public class PhotoLIST {
    private int id;
    private String photo_title;
    private String photo_url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoto_title() {
        return photo_title;
    }

    public void setPhoto_title(String photo_title) {
        this.photo_title = photo_title;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    @Override
    public String toString() {
        return "PhotoLIST{" +
                "id=" + id +
                ", photo_title='" + photo_title + '\'' +
                ", photo_url='" + photo_url + '\'' +
                '}';
    }
}
