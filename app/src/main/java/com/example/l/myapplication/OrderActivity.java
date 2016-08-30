package com.example.l.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by 刘宇轩 on 2016/8/26.
 */
//确认订单界面
public class OrderActivity extends AppCompatActivity {

    private List<SubmitOrderInfo>list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent=getIntent();
        int length=intent.getIntExtra("listlength",0);
        for(int i=0;i<length;i++){
            SubmitOrderInfo submitOrderInfo=new SubmitOrderInfo();
            submitOrderInfo.setDishname(intent.getStringExtra("dishname"+i));
            submitOrderInfo.setDishnum(intent.getStringExtra("dishnum"+i));
            submitOrderInfo.setDishnum(intent.getStringExtra("dishprice"+i));
            list.add(submitOrderInfo);
        }
        TextView textView=(TextView)findViewById(R.id.all_pay);
        textView.setText(intent.getStringExtra("allprice"));
        ListView listView=(ListView)findViewById(R.id.submit_dishinfo);
        SubmitOrderInfoAdapter MysbAdapter=new SubmitOrderInfoAdapter(this, R.layout.submitorder_item,list);
        listView.setAdapter(MysbAdapter);
    }
}
