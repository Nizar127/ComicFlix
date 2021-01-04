package com.comicflix.Model;

public class MovieDetail {

    String movieID;
    String movidTitle;
    String movieEpisode;
    String movieDescription;
    String movieReviewID;
    String movieGenre;
    String moviePoster;
    String moviePreview;
    String movieYear;
    String moviePeriod;
    String movieCastList;

    public MovieDetail(String movieID, String movidTitle, String movieEpisode, String movieDescription, String movieReviewID, String movieGenre, String moviePoster, String moviePreview, String movieYear, String moviePeriod, String movieCastList) {
        this.movieID = movieID;
        this.movidTitle = movidTitle;
        this.movieEpisode = movieEpisode;
        this.movieDescription = movieDescription;
        this.movieReviewID = movieReviewID;
        this.movieGenre = movieGenre;
        this.moviePoster = moviePoster;
        this.moviePreview = moviePreview;
        this.movieYear = movieYear;
        this.moviePeriod = moviePeriod;
        this.movieCastList = movieCastList;
    }

    public MovieDetail(){

    }

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public String getMovidTitle() {
        return movidTitle;
    }

    public void setMovidTitle(String movidTitle) {
        this.movidTitle = movidTitle;
    }

    public String getMovieEpisode() {
        return movieEpisode;
    }

    public void setMovieEpisode(String movieEpisode) {
        this.movieEpisode = movieEpisode;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public String getMovieReviewID() {
        return movieReviewID;
    }

    public void setMovieReviewID(String movieReviewID) {
        this.movieReviewID = movieReviewID;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public String getMoviePoster() {
        return moviePoster;
    }

    public void setMoviePoster(String moviePoster) {
        this.moviePoster = moviePoster;
    }

    public String getMoviePreview() {
        return moviePreview;
    }

    public void setMoviePreview(String moviePreview) {
        this.moviePreview = moviePreview;
    }

    public String getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(String movieYear) {
        this.movieYear = movieYear;
    }

    public String getMoviePeriod() {
        return moviePeriod;
    }

    public void setMoviePeriod(String moviePeriod) {
        this.moviePeriod = moviePeriod;
    }

    public String getMovieCastList() {
        return movieCastList;
    }

    public void setMovieCastList(String movieCastList) {
        this.movieCastList = movieCastList;
    }
}
