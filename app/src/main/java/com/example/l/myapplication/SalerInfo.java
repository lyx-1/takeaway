package com.example.l.myapplication;

/**
 * Created by 刘宇轩 on 2016/8/26.
 */
//每个商家菜名条目需要的数据
public class SalerInfo {
    private String dishname,dishprice,dishnumber;
    private int dishphotoid;


    public String getDishnumber() {
        return dishnumber;
    }

    public void setDishnumber(String dishnumber) {
        this.dishnumber = dishnumber;
    }

    public int getDishphotoid() {
        return dishphotoid;
    }

    public String getDishname() {
        return dishname;
    }

    public void setDishname(String dishname) {
        this.dishname = dishname;
    }

    public void setDishphotoid(int dishphotoid) {
        this.dishphotoid = dishphotoid;
    }

    public String getDishprice() {
        return dishprice;
    }

    public void setDishprice(String dishprice) {
        this.dishprice = dishprice;
    }
}


