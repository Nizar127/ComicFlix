package com.comicflix.Model;

import java.util.List;

public class AllPlaylist {

    String UserPlaylistID;
    String UserPlaylistTitle;
    private List<PlaylistItem> playlistItemList = null;

    public AllPlaylist(String userPlaylistID, String userPlaylistTitle, List<PlaylistItem> playlistItemList) {
        UserPlaylistID = userPlaylistID;
        UserPlaylistTitle = userPlaylistTitle;
        this.playlistItemList = playlistItemList;
    }

    public String getUserPlaylistID() {
        return UserPlaylistID;
    }

    public void setUserPlaylistID(String userPlaylistID) {
        UserPlaylistID = userPlaylistID;
    }

    public String getUserPlaylistTitle() {
        return UserPlaylistTitle;
    }

    public void setUserPlaylistTitle(String userPlaylistTitle) {
        UserPlaylistTitle = userPlaylistTitle;
    }

    public List<PlaylistItem> getPlaylistItemList() {
        return playlistItemList;
    }

    public void setPlaylistItemList(List<PlaylistItem> playlistItemList) {
        this.playlistItemList = playlistItemList;
    }
}
