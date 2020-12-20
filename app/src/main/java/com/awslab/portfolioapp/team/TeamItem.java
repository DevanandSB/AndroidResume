package com.awslab.portfolioapp.team;

public class TeamItem {

    private String name;
    private int img;
    private String imgcerti ;

    public TeamItem(String name, String desc, int img) {
        this.name = name;
        this.imgcerti = imgcerti;
        this.img = img;
    }

    public TeamItem(String google, int googlecerti, int img) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return imgcerti;
    }

    public void setDesc(String desc) {
        this.imgcerti = desc;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
