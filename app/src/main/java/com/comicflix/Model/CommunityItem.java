package com.comicflix.Model;

public class CommunityItem {

    Integer communityItemID;
    String communityTitle;
    String communityNum;
    String communityPoster;
    String communityPublisher;
    String communityGenre;
    String communityFavourites;
    String communityDateAdded;

    public CommunityItem(Integer communityItemID, String communityTitle, String communityNum, String communityPoster, String communityPublisher, String communityGenre, String communityFavourites, String communityDateAdded) {
        this.communityItemID = communityItemID;
        this.communityTitle = communityTitle;
        this.communityNum = communityNum;
        this.communityPoster = communityPoster;
        this.communityPublisher = communityPublisher;
        this.communityGenre = communityGenre;
        this.communityFavourites = communityFavourites;
        this.communityDateAdded = communityDateAdded;
    }

    public Integer getCommunityItemID() {
        return communityItemID;
    }

    public void setCommunityItemID(Integer communityItemID) {
        this.communityItemID = communityItemID;
    }

    public String getCommunityTitle() {
        return communityTitle;
    }

    public void setCommunityTitle(String communityTitle) {
        this.communityTitle = communityTitle;
    }

    public String getCommunityNum() {
        return communityNum;
    }

    public void setCommunityNum(String communityNum) {
        this.communityNum = communityNum;
    }

    public String getCommunityPoster() {
        return communityPoster;
    }

    public void setCommunityPoster(String communityPoster) {
        this.communityPoster = communityPoster;
    }

    public String getCommunityPublisher() {
        return communityPublisher;
    }

    public void setCommunityPublisher(String communityPublisher) {
        this.communityPublisher = communityPublisher;
    }

    public String getCommunityGenre() {
        return communityGenre;
    }

    public void setCommunityGenre(String communityGenre) {
        this.communityGenre = communityGenre;
    }

    public String getCommunityFavourites() {
        return communityFavourites;
    }

    public void setCommunityFavourites(String communityFavourites) {
        this.communityFavourites = communityFavourites;
    }

    public String getCommunityDateAdded() {
        return communityDateAdded;
    }

    public void setCommunityDateAdded(String communityDateAdded) {
        this.communityDateAdded = communityDateAdded;
    }
}
