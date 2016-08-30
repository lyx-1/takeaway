package com.example.l.myapplication;

/**
 * Created by 刘宇轩 on 2016/8/27.
 */
//该类存放订单信息
public class SubmitOrderInfo {
    String salername,dishname,dishnum,dishprice,allprice;

    public void setAllprice(String allprice) {
        this.allprice = allprice;
    }

    public void setDishname(String dishname) {
        this.dishname = dishname;
    }

    public void setDishprice(String dishprice) {
        this.dishprice = dishprice;
    }

    public String getAllprice() {
        return allprice;
    }

    public String getDishname() {
        return dishname;
    }

    public String getDishnum() {
        return dishnum;
    }

    public String getDishprice() {
        return dishprice;
    }

    public String getSalername() {
        return salername;
    }

    public void setDishnum(String dishnum) {
        this.dishnum = dishnum;
    }

    public void setSalername(String salername) {
        this.salername = salername;
    }

}

