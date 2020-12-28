package com.comicflix.Model;

import java.util.List;

public class AllCommunityItem {

    String communityID;
    String communityTitle;
    private List<CommunityItem> communityItemList = null;

    public AllCommunityItem(String communityID, String communityTitle, List<CommunityItem> communityItemList) {
        this.communityID = communityID;
        this.communityTitle = communityTitle;
        this.communityItemList = communityItemList;
    }

    public String getCommunityID() {
        return communityID;
    }

    public void setCommunityID(String communityID) {
        this.communityID = communityID;
    }

    public String getCommunityTitle() {
        return communityTitle;
    }

    public void setCommunityTitle(String communityTitle) {
        this.communityTitle = communityTitle;
    }

    public List<CommunityItem> getCommunityItemList() {
        return communityItemList;
    }

    public void setCommunityItemList(List<CommunityItem> communityItemList) {
        this.communityItemList = communityItemList;
    }
}
