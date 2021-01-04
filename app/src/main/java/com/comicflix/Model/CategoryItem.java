package com.comicflix.Model;

public class CategoryItem {
    Integer catid;
    String AnimeName;
    String ImgUrl;
    String fileUrl;
    String catName;

    public CategoryItem(Integer catid, String animeName, String imgUrl, String fileUrl, String catName) {
        this.catid = catid;
        AnimeName = animeName;
        ImgUrl = imgUrl;
        this.fileUrl = fileUrl;
        this.catName = catName;
    }

    public Integer getCatid() {
        return catid;
    }

    public void setCatid(Integer catid) {
        this.catid = catid;
    }

    public String getAnimeName() {
        return AnimeName;
    }

    public void setAnimeName(String animeName) {
        AnimeName = animeName;
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

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
