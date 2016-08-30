package com.example.l.myapplication;

/**
 * Created by 田起光 on 2016/8/27.
 */
public class News {
    private int image, search;

    public News( int search,  int image) {
        this.search = search;
        this.image = image;
    }


    public int getSearch() {
        return search;
    }

    public void setSearch(int search) {
        this.search = search;
    }



    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

