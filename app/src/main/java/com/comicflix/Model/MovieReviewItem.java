package com.comicflix.Model;

public class MovieReviewItem {

    String uuid;
    String username;
    String userImg;
    String text;

    public MovieReviewItem(String uuid, String username, String userImg, String text) {
        this.uuid = uuid;
        this.username = username;
        this.userImg = userImg;
        this.text = text;
    }

    public MovieReviewItem(){

    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
