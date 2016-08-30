package com.example.l.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by MSI on 2016/8/30.
 */
public class CollectionAdapter extends ArrayAdapter<NewsInfo> {
    private int resourceId;

    public CollectionAdapter(Context context, int textViewResourceId,
                             List<NewsInfo> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
        NewsInfo info = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewHolder = new ViewHolder();
            viewHolder.merchant_image = (ImageView) view.findViewById(R.id.merchant_image);
            viewHolder.merchant_name = (TextView) view.findViewById(R.id.merchant_name);
            viewHolder.merchant_sales = (TextView) view.findViewById(R.id.merchant_sales);
            viewHolder.merchant_price = (TextView) view.findViewById(R.id.merchant_price);
            viewHolder.merchant_time = (TextView) view.findViewById(R.id.merchant_time);
            view.setTag(viewHolder); // 将ViewHolder存储在View中
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag(); // 重新获取ViewHolder
        }
        viewHolder.merchant_image.setImageResource(info.getMerchantImage());
        viewHolder.merchant_name.setText(info.getMerchantName());
        viewHolder.merchant_sales.setText(info.getMerchantSales());
        viewHolder.merchant_price.setText(info.getMerchantPrice());
        viewHolder.merchant_time.setText(info.getMerchantTime());
        return view;
    }
    class ViewHolder {
        ImageView merchant_image;
        TextView merchant_name;
        TextView merchant_sales;
        TextView merchant_price;
        TextView merchant_time;
    }
}