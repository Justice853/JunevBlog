package com.cxp.blog.pojo;

public class PictureDo {
    private Long id;

    private String pictureaddress;

    private String picturedescription;

    private String picturename;

    private String picturetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPictureaddress() {
        return pictureaddress;
    }

    public void setPictureaddress(String pictureaddress) {
        this.pictureaddress = pictureaddress == null ? null : pictureaddress.trim();
    }

    public String getPicturedescription() {
        return picturedescription;
    }

    public void setPicturedescription(String picturedescription) {
        this.picturedescription = picturedescription == null ? null : picturedescription.trim();
    }

    public String getPicturename() {
        return picturename;
    }

    public void setPicturename(String picturename) {
        this.picturename = picturename == null ? null : picturename.trim();
    }

    public String getPicturetime() {
        return picturetime;
    }

    public void setPicturetime(String picturetime) {
        this.picturetime = picturetime == null ? null : picturetime.trim();
    }
}