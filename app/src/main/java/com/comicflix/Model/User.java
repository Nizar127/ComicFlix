package com.comicflix.Model;

public class User {
   String uuid;
   String email;
   String username;
   String password;
   String image;
   String fullname;
   String profile_pic;
   String plan;

    public User(String uuid, String email, String username, String password, String image, String fullname, String profile_pic, String plan) {
        this.uuid = uuid;
        this.email = email;
        this.username = username;
        this.password = password;
        this.image = image;
        this.fullname = fullname;
        this.profile_pic = profile_pic;
        this.plan = plan;
    }

    //no-arg constructor
    public User(){

    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getProfile_pic() {
        return profile_pic;
    }

    public void setProfile_pic(String profile_pic) {
        this.profile_pic = profile_pic;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
}
