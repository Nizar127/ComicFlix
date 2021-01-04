package com.comicflix.Model;

import java.util.List;

public class AllMovieReview {

    String MovieReviewID;
    String MovieReviewTitle;
    private List<MovieReviewItem> movieReviewItemList = null;

    public AllMovieReview(String movieReviewID, String movieReviewTitle, List<MovieReviewItem> movieReviewItemList) {
        MovieReviewID = movieReviewID;
        MovieReviewTitle = movieReviewTitle;
        this.movieReviewItemList = movieReviewItemList;
    }

    public String getMovieReviewID() {
        return MovieReviewID;
    }

    public void setMovieReviewID(String movieReviewID) {
        MovieReviewID = movieReviewID;
    }

    public String getMovieReviewTitle() {
        return MovieReviewTitle;
    }

    public void setMovieReviewTitle(String movieReviewTitle) {
        MovieReviewTitle = movieReviewTitle;
    }

    public List<MovieReviewItem> getMovieReviewItemList() {
        return movieReviewItemList;
    }

    public void setMovieReviewItemList(List<MovieReviewItem> movieReviewItemList) {
        this.movieReviewItemList = movieReviewItemList;
    }
}
