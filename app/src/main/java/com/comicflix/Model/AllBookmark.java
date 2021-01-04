package com.comicflix.Model;

import java.util.List;

public class AllBookmark {

    String BookmartID;
    String BookmartTitle;
    private List<BookmartListItem> bookmartListItemList = null;

    public AllBookmark(String bookmartID, String bookmartTitle, List<BookmartListItem> bookmartListItemList) {
        BookmartID = bookmartID;
        BookmartTitle = bookmartTitle;
        this.bookmartListItemList = bookmartListItemList;
    }

    public String getBookmartID() {
        return BookmartID;
    }

    public void setBookmartID(String bookmartID) {
        BookmartID = bookmartID;
    }

    public String getBookmartTitle() {
        return BookmartTitle;
    }

    public void setBookmartTitle(String bookmartTitle) {
        BookmartTitle = bookmartTitle;
    }

    public List<BookmartListItem> getBookmartListItemList() {
        return bookmartListItemList;
    }

    public void setBookmartListItemList(List<BookmartListItem> bookmartListItemList) {
        this.bookmartListItemList = bookmartListItemList;
    }
}
