package com.comicflix.Model;

public class Manga_Item_List {

    Integer MangaItemID;
    String MangaTitle;
    String MangaPublisher;
    String MangaPoster;
    String MangaGenre;
    String MangaChapter;
    String dateAdded;

    public Manga_Item_List(Integer mangaItemID, String mangaTitle, String mangaPublisher, String mangaPoster, String mangaGenre, String mangaChapter, String dateAdded) {
        MangaItemID = mangaItemID;
        MangaTitle = mangaTitle;
        MangaPublisher = mangaPublisher;
        MangaPoster = mangaPoster;
        MangaGenre = mangaGenre;
        MangaChapter = mangaChapter;
        this.dateAdded = dateAdded;
    }

    public String getMangaPoster() {
        return MangaPoster;
    }

    public void setMangaPoster(String mangaPoster) {
        MangaPoster = mangaPoster;
    }

    public Integer getMangaItemID() {
        return MangaItemID;
    }

    public void setMangaItemID(Integer mangaItemID) {
        MangaItemID = mangaItemID;
    }

    public String getMangaTitle() {
        return MangaTitle;
    }

    public void setMangaTitle(String mangaTitle) {
        MangaTitle = mangaTitle;
    }

    public String getMangaPublisher() {
        return MangaPublisher;
    }

    public void setMangaPublisher(String mangaPublisher) {
        MangaPublisher = mangaPublisher;
    }

    public String getMangaGenre() {
        return MangaGenre;
    }

    public void setMangaGenre(String mangaGenre) {
        MangaGenre = mangaGenre;
    }

    public String getMangaChapter() {
        return MangaChapter;
    }

    public void setMangaChapter(String mangaChapter) {
        MangaChapter = mangaChapter;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }
}

