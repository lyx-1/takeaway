package com.example.l.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lenovo on 2016/8/30.
 * written by 田起光
 */
public class MyOrderAdapter extends BaseAdapter {

    private Context mcontext;
    private List<Info> mlist;
    public MyOrderAdapter(List<Info> mlist, Context mcontext){

        this.mlist=mlist;
        this.mcontext=mcontext;
    }

    @Override
    public int getCount() {
        int ret = 0;
        if (mlist != null) {
            ret =mlist.size();
        }
        return ret;
    }

    @Override
    public Object getItem(int position) {
        return mlist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;


        if(convertView==null){
            viewHolder=new ViewHolder();
            convertView=LayoutInflater.from(mcontext).inflate(R.layout.main_list, parent, false);
            viewHolder.name= (TextView) convertView.findViewById(R.id.name);
            viewHolder.picture= (ImageView) convertView.findViewById(R.id.picture);
            viewHolder.sale= (TextView) convertView.findViewById(R.id.sale);
            viewHolder.send= (TextView) convertView.findViewById(R.id.send);
            viewHolder.time= (TextView) convertView.findViewById(R.id.time);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder= (ViewHolder) convertView.getTag();
        }
        Info info=mlist.get(position);

        viewHolder.sale.setText(info.getSale());
        viewHolder.time.setText(info.getTime());
        viewHolder.picture.setImageResource(info.getPicture());
        viewHolder.name.setText(info.getName());
        viewHolder.send.setText(info.getSend());

        return convertView;
    }

    class ViewHolder {
        TextView name,sale,send,time;
        ImageView picture;
    }
}
