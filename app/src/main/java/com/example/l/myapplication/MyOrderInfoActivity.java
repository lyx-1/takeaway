package com.example.l.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 write by 刘宇轩
 */
public class MyOrderInfoActivity extends Activity {

    private List<SubmitOrderInfo> list=new ArrayList<>() ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_order_info);
        initlist();
        ListView listView=(ListView)findViewById(R.id.order_saleinfo);
        SubmitOrderInfoAdapter submitOrderInfoAdapter=new SubmitOrderInfoAdapter(this,R.layout.submitorder_item,list);
        listView.setAdapter(submitOrderInfoAdapter);


       //this.getActionBar().hide();
    }

    private void  initlist(){
        SubmitOrderInfo submitOrderInfo=new SubmitOrderInfo();
        submitOrderInfo.setDishname("小炒肉");
        submitOrderInfo.setDishnum("1");
        submitOrderInfo.setDishprice("14");
        list.add(submitOrderInfo);
    }
}
