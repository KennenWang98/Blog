package com.blog.demo.entity;

public class Photos {
    private int id;
    private int list_id;
    private String photo_url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getList_id() {
        return list_id;
    }

    public void setList_id(int list_id) {
        this.list_id = list_id;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    @Override
    public String toString() {
        return "Photos{" +
                "id=" + id +
                ", list_id=" + list_id +
                ", photo_url='" + photo_url + '\'' +
                '}';
    }

}
