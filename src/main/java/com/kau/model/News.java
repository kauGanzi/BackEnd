package com.kau.model;

public class News {
    private long id;
    private String title;
    private String content;
    private String imageUrl;

    public News() { }
    
    public News(long id, String title, String content, String imageUrl) { 
        this.id = id;
        this.title = title;
        this.content = content;
        this.imageUrl = imageUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl() {
        this.imageUrl = imageUrl;
    }

}