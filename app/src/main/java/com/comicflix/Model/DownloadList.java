package com.comicflix.Model;

import java.util.List;

public class DownloadList {

    String downloadID;
    String movieTitle;
    private List<MovieDetail> movieDetailList = null;
    String movieStorageSpace;
    String is_series;
    String last_watched;


    public DownloadList(String downloadID, String movieTitle, List<MovieDetail> movieDetailList, String movieStorageSpace, String is_series, String last_watched) {
        this.downloadID = downloadID;
        this.movieTitle = movieTitle;
        this.movieDetailList = movieDetailList;
        this.movieStorageSpace = movieStorageSpace;
        this.is_series = is_series;
        this.last_watched = last_watched;
    }

    public String getDownloadID() {
        return downloadID;
    }

    public void setDownloadID(String downloadID) {
        this.downloadID = downloadID;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public List<MovieDetail> getMovieDetailList() {
        return movieDetailList;
    }

    public void setMovieDetailList(List<MovieDetail> movieDetailList) {
        this.movieDetailList = movieDetailList;
    }

    public String getMovieStorageSpace() {
        return movieStorageSpace;
    }

    public void setMovieStorageSpace(String movieStorageSpace) {
        this.movieStorageSpace = movieStorageSpace;
    }

    public String getIs_series() {
        return is_series;
    }

    public void setIs_series(String is_series) {
        this.is_series = is_series;
    }

    public String getLast_watched() {
        return last_watched;
    }

    public void setLast_watched(String last_watched) {
        this.last_watched = last_watched;
    }
}
