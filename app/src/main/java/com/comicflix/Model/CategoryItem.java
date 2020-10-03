package com.comicflix.Model;

public class CategoryItem {
    Integer id;
    String AnimeName;
    String ImgUrl;
    String fileUrl;
    String catName;

    public CategoryItem(Integer id, String animeName, String imgUrl, String fileUrl, String catName) {
        this.id = id;
        AnimeName = animeName;
        ImgUrl = imgUrl;
        this.fileUrl = fileUrl;
        this.catName = catName;
    }


    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
