package com.comicflix.Model;

import java.util.List;

public class AllMangaItem {

    String AllMangaID;
    String AllMangaTitle;
    private List<Manga_Item_List> mangaItemLists = null;

    public AllMangaItem(String allMangaID, String allMangaTitle, List<Manga_Item_List> mangaItemLists) {
        AllMangaID = allMangaID;
        AllMangaTitle = allMangaTitle;
        this.mangaItemLists = mangaItemLists;
    }

    public String getAllMangaID() {
        return AllMangaID;
    }

    public void setAllMangaID(String allMangaID) {
        AllMangaID = allMangaID;
    }

    public String getAllMangaTitle() {
        return AllMangaTitle;
    }

    public void setAllMangaTitle(String allMangaTitle) {
        AllMangaTitle = allMangaTitle;
    }

    public List<Manga_Item_List> getMangaItemLists() {
        return mangaItemLists;
    }

    public void setMangaItemLists(List<Manga_Item_List> mangaItemLists) {
        this.mangaItemLists = mangaItemLists;
    }
}
