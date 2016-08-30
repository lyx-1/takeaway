package com.example.l.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 刘宇轩 on 2016/8/26.
 */
public class SalerInfoAdapter extends ArrayAdapter<SalerInfo>  {
    private int resourceId;
    private MyCallBack myCallBack;

    public SalerInfoAdapter(Context context,int textViewResourceId,List<SalerInfo> objects,MyCallBack myCallBack){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
        this.myCallBack=myCallBack;

    }

    public View getView(int position,View convertView,ViewGroup parent){
        SalerInfo salerInfo=getItem(position);
        final View view=LayoutInflater.from(getContext()).inflate(resourceId,null);
        ImageView dishimage=(ImageView)view.findViewById(R.id.dish_photo);
        TextView dishname=(TextView)view.findViewById(R.id.dish_name);
        TextView dishprice=(TextView)view.findViewById(R.id.dish_price);
        TextView dishnum=(TextView)view.findViewById(R.id.dish_number);
        dishnum.setText(salerInfo.getDishnumber());
        dishimage.setImageResource(salerInfo.getDishphotoid());
        dishname.setText(salerInfo.getDishname());
        dishprice.setText(salerInfo.getDishprice());
        Button plusdish=(Button)view.findViewById(R.id.plus_dish);
        Button minusdish=(Button)view.findViewById(R.id.minus_dish);
        plusdish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView dishname=(TextView)view.findViewById(R.id.dish_name);
                TextView dishprice=(TextView)view.findViewById(R.id.dish_price);
                int price=Integer.parseInt(dishprice.getText().toString());
                myCallBack.onItemWidgetClickListener(v,price,dishname.getText().toString(),view);

            }
        });

        minusdish.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                TextView dishnum=(TextView)view.findViewById(R.id.dish_number);
                TextView dishprice=(TextView)view.findViewById(R.id.dish_price);
                TextView dishname=(TextView)view.findViewById(R.id.dish_name);
                int i=Integer.parseInt(dishnum.getText().toString());
                if(i>0) {
                    int price = Integer.parseInt(dishprice.getText().toString());
                    myCallBack.onItemWidgetClickListener(v,price,dishname.getText().toString(),view);
                }
            }
        });
        return view;
    }





    public interface MyCallBack{
        public void onItemWidgetClickListener(View v, int i, String name, View view);
    }


}
