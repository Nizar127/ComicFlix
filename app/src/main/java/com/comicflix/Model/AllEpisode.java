package com.comicflix.Model;

import java.util.List;

public class AllEpisode {

    String episodeID;
    String episodeTitle;
    private List<EpisodeItem> episodeItemList = null;

    public AllEpisode(String episodeID, String episodeTitle, List<EpisodeItem> episodeItemList) {
        this.episodeID = episodeID;
        this.episodeTitle = episodeTitle;
        this.episodeItemList = episodeItemList;
    }

    public String getEpisodeID() {
        return episodeID;
    }

    public void setEpisodeID(String episodeID) {
        this.episodeID = episodeID;
    }

    public String getEpisodeTitle() {
        return episodeTitle;
    }

    public void setEpisodeTitle(String episodeTitle) {
        this.episodeTitle = episodeTitle;
    }

    public List<EpisodeItem> getEpisodeItemList() {
        return episodeItemList;
    }

    public void setEpisodeItemList(List<EpisodeItem> episodeItemList) {
        this.episodeItemList = episodeItemList;
    }
}
