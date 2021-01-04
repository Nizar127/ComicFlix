package com.comicflix.Model;

public class BannerAnime {
    Integer id;
    String animeMovies;
    String ImgUrl;
    String fileUrl;

    public BannerAnime(Integer id, String animeMovies, String imgUrl, String fileUrl) {
        this.id = id;
        this.animeMovies = animeMovies;
        ImgUrl = imgUrl;
        this.fileUrl = fileUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnimeMovies() {
        return animeMovies;
    }

    public void setAnimeMovies(String animeMovies) {
        this.animeMovies = animeMovies;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String imgUrl) {
        ImgUrl = imgUrl;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
}
