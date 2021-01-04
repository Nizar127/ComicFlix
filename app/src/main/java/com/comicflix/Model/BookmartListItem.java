package com.comicflix.Model;

public class BookmartListItem {

    String bookmartID;
    String UserID;
    String contentHeadID;
    String contentTitle;
    String contentPoster;
    String contentURL;
    String is_favourite;
    String last_watched;

    public BookmartListItem(String bookmartID, String userID, String contentHeadID, String contentTitle, String contentPoster, String contentURL, String is_favourite, String last_watched) {
        this.bookmartID = bookmartID;
        UserID = userID;
        this.contentHeadID = contentHeadID;
        this.contentTitle = contentTitle;
        this.contentPoster = contentPoster;
        this.contentURL = contentURL;
        this.is_favourite = is_favourite;
        this.last_watched = last_watched;
    }

    public String getBookmartID() {
        return bookmartID;
    }

    public void setBookmartID(String bookmartID) {
        this.bookmartID = bookmartID;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getContentHeadID() {
        return contentHeadID;
    }

    public void setContentHeadID(String contentHeadID) {
        this.contentHeadID = contentHeadID;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle;
    }

    public String getContentPoster() {
        return contentPoster;
    }

    public void setContentPoster(String contentPoster) {
        this.contentPoster = contentPoster;
    }

    public String getContentURL() {
        return contentURL;
    }

    public void setContentURL(String contentURL) {
        this.contentURL = contentURL;
    }

    public String getIs_favourite() {
        return is_favourite;
    }

    public void setIs_favourite(String is_favourite) {
        this.is_favourite = is_favourite;
    }

    public String getLast_watched() {
        return last_watched;
    }

    public void setLast_watched(String last_watched) {
        this.last_watched = last_watched;
    }
}
