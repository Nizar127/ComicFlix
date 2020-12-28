package com.comicflix.Model;

import java.sql.Timestamp;

public class EpisodeItem {

    Integer EpisodeID;
    String EpisodeTitle;
    String EpisodeNum;
    String EpisodeDesc;
    String EpisodePeriod;
    String dateAdded;
    String episodePublished;

    public EpisodeItem(Integer episodeID, String episodeTitle, String episodeNum, String episodeDesc, String episodePeriod, String dateAdded, String episodePublished) {
        EpisodeID = episodeID;
        EpisodeTitle = episodeTitle;
        EpisodeNum = episodeNum;
        EpisodeDesc = episodeDesc;
        EpisodePeriod = episodePeriod;
        this.dateAdded = dateAdded;
        this.episodePublished = episodePublished;
    }

    public Integer getEpisodeID() {
        return EpisodeID;
    }

    public void setEpisodeID(Integer episodeID) {
        EpisodeID = episodeID;
    }

    public String getEpisodeTitle() {
        return EpisodeTitle;
    }

    public void setEpisodeTitle(String episodeTitle) {
        EpisodeTitle = episodeTitle;
    }

    public String getEpisodeNum() {
        return EpisodeNum;
    }

    public void setEpisodeNum(String episodeNum) {
        EpisodeNum = episodeNum;
    }

    public String getEpisodeDesc() {
        return EpisodeDesc;
    }

    public void setEpisodeDesc(String episodeDesc) {
        EpisodeDesc = episodeDesc;
    }

    public String getEpisodePeriod() {
        return EpisodePeriod;
    }

    public void setEpisodePeriod(String episodePeriod) {
        EpisodePeriod = episodePeriod;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getEpisodePublished() {
        return episodePublished;
    }

    public void setEpisodePublished(String episodePublished) {
        this.episodePublished = episodePublished;
    }
}

