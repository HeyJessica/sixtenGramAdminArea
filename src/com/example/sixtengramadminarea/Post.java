package com.example.sixtengramadminarea;

import javafx.geometry.Pos;

public class Post {

    private int likeCounter;
    private String description;
    private String date;
    private String userName;
    private String imageUrl;

    Post(int likeCounter, String description, String date, String userName, String imageUrl){
        this.likeCounter = likeCounter;
        this.description = description;
        this.date = date;
        this.userName = userName;
        this.imageUrl = imageUrl;
    }

    public int getLikeCounter() {
        return likeCounter;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public String getUserName() {
        return userName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

}
