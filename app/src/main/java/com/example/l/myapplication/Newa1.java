package com.example.l.myapplication;

/**
 * Created by lenovo on 2016/8/27.
 */
public class Newa1 {
    private String sale;
    private String name;
    private String time;
    private String send;
    private int picture;

    public Newa1(String name, String sale, String time, String send, int picture) {
        this.name = name;
        this.sale = sale;
        this.time = time;
        this.send = send;
        this.picture = picture;
    }
    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSend() {
        return send;
    }

    public void setSend(String send) {
        this.send = send;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }




}
