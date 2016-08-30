package com.example.l.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 刘宇轩 on 2016/8/27.
 */
public class SubmitOrderInfoAdapter extends ArrayAdapter<SubmitOrderInfo>{
    private int resourceId;
    public SubmitOrderInfoAdapter(Context context, int resource, List<SubmitOrderInfo> objects) {
        super(context, resource, objects);
        resourceId=resource;
    }

    public View getView(int position,View convertView,ViewGroup parent){
        SubmitOrderInfo submitOrderInfo=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,null);
        TextView sdishname=(TextView)view.findViewById(R.id.submit_dishname);
        TextView sdishnum=(TextView)view.findViewById(R.id.submit_dishnum);
        TextView sdishprice=(TextView)view.findViewById(R.id.submit_dishprice);
        sdishname.setText(submitOrderInfo.getDishname());
        sdishnum.setText(submitOrderInfo.getDishnum());
        sdishprice.setText(submitOrderInfo.getDishprice());
        return view;
    }
}
