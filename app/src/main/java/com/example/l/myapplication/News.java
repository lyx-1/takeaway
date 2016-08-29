package com.example.l.myapplication;

/**
 * Created by lenovo on 2016/8/27.
 */
public class News {
    private String gps, search_button;
    private int image, search;

    public News(String gps, int search,  int image) {
        this.gps = gps;
        this.search = search;
        this.image = image;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public int getSearch() {
        return search;
    }

    public void setSearch(int search) {
        this.search = search;
    }

    public String getSearch_button() {
        return search_button;
    }

    public void setSearch_button(String search_button) {
        this.search_button = search_button;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

