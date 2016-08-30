package com.example.l.myapplication;

/**
 * Created by MSI on 2016/8/30.
 */
public class NewsInfo {
        private String merchantName,merchantSales,merchantPrice,merchantTime;
        private int merchantImage;
        public NewsInfo(int merchantImage, String merchantName, String merchantSales, String merchantPrice, String merchantTime){
            this.merchantImage=merchantImage;
            this.merchantName=merchantName;
            this.merchantSales=merchantSales;
            this.merchantPrice=merchantPrice;
            this.merchantTime=merchantTime;
    }
        public int getMerchantImage() {

            return merchantImage;
        }

        public String getMerchantName() {
            return merchantName;
        }

        public String getMerchantPrice() {
            return merchantPrice;
        }

        public String getMerchantSales() {
            return merchantSales;
        }

        public String getMerchantTime() {
            return merchantTime;
        }
    }
