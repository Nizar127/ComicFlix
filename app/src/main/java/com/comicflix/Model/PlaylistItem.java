package com.comicflix.Model;

public class PlaylistItem {

    Integer playlistID;
    Integer UserID;
    Integer contentID;
    Integer playlistFolderID;   //playlist will allow user to create multiple folder
    String playlistFolderTitle;
    String contentTitle;
    String contentPoster;
    String contentURL;
    String is_premium;  //premium can skip
    String is_favourite;
    String last_watched;

    public PlaylistItem(Integer playlistID, Integer userID, Integer contentID, Integer playlistFolderID, String playlistFolderTitle, String contentTitle, String contentPoster, String contentURL, String is_premium, String is_favourite, String last_watched) {
        this.playlistID = playlistID;
        UserID = userID;
        this.contentID = contentID;
        this.playlistFolderID = playlistFolderID;
        this.playlistFolderTitle = playlistFolderTitle;
        this.contentTitle = contentTitle;
        this.contentPoster = contentPoster;
        this.contentURL = contentURL;
        this.is_premium = is_premium;
        this.is_favourite = is_favourite;
        this.last_watched = last_watched;
    }

    public Integer getPlaylistID() {
        return playlistID;
    }

    public void setPlaylistID(Integer playlistID) {
        this.playlistID = playlistID;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public Integer getContentID() {
        return contentID;
    }

    public void setContentID(Integer contentID) {
        this.contentID = contentID;
    }

    public Integer getPlaylistFolderID() {
        return playlistFolderID;
    }

    public void setPlaylistFolderID(Integer playlistFolderID) {
        this.playlistFolderID = playlistFolderID;
    }

    public String getPlaylistFolderTitle() {
        return playlistFolderTitle;
    }

    public void setPlaylistFolderTitle(String playlistFolderTitle) {
        this.playlistFolderTitle = playlistFolderTitle;
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

    public String getIs_premium() {
        return is_premium;
    }

    public void setIs_premium(String is_premium) {
        this.is_premium = is_premium;
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
