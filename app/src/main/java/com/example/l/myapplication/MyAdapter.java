package com.example.l.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 田起光 on 2016/8/27.
 */
public class MyAdapter extends BaseAdapter{
    private Context mcontext;
    private List<Object> list;

public MyAdapter(List<Object> list,Context mcontext){
    this.list=list;
    this.mcontext=mcontext;
}
    @Override
    public int getCount() {
        int ret = 0;
        if (list != null) {
            ret = list.size();
        }
        return ret;
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        if (list.get(position) instanceof News) {
            return 0;
        } else if (list.get(position) instanceof Info) {
            return 1;
        } else {
            return super.getItemViewType(position);
        }
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        int type = getItemViewType(position);
        NewsViewHolder newsViewHolder=null;
        NewaViewHolder newaViewHolder=null;
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mcontext);

            switch (type) {
                case 0:
                    newsViewHolder=new NewsViewHolder();
                    convertView = inflater.inflate(R.layout.image_list, parent, false);
                    newsViewHolder.gps = (Button) convertView.findViewById(R.id.gps);
                    newsViewHolder.search = (EditText) convertView.findViewById(R.id.search);
                    newsViewHolder.search_button = (Button) convertView.findViewById(R.id.search_button);
                    newsViewHolder.image = (ImageView) convertView.findViewById(R.id.image);
                    convertView.setTag(R.id.News,newsViewHolder);
                    break;
                case 1:
                    newaViewHolder=new NewaViewHolder();
                    convertView = inflater.inflate(R.layout.main_list, parent, false);
                    newaViewHolder.picture = (ImageView) convertView.findViewById(R.id.picture);
                    newaViewHolder.name = (TextView) convertView.findViewById(R.id.name);
                    newaViewHolder.send = (TextView) convertView.findViewById(R.id.send);
                    newaViewHolder.time = (TextView) convertView.findViewById(R.id.time);
                    newaViewHolder.sale = (TextView) convertView.findViewById(R.id.sale);
                    convertView.setTag(R.id.Newa,newaViewHolder);
                    break;
            }

            } else{
            switch (type) {
            case 0:
                newsViewHolder = (NewsViewHolder) convertView.getTag(R.id.News);
                break;
            case 1:
                newaViewHolder= (NewaViewHolder) convertView.getTag(R.id.Newa);
                break;
            }
            }

        Object obj = list.get(position);
        switch (type){
            case 0:
                News news = (News) obj;
                if(news != null){
                    newsViewHolder.image.setImageResource(news.getImage());
                }
                break;
            case 1:
                Info info = (Info) obj;
                if(info != null){
                    newaViewHolder.picture.setImageResource(info.getPicture());
                    newaViewHolder.name.setText(info.getName());
                    newaViewHolder.sale.setText(info.getSale());
                    newaViewHolder.send.setText(info.getSend());
                    newaViewHolder.time.setText(info.getTime());

                }

                break;
        }
            return convertView;
        }

    class NewsViewHolder{
        Button search_button,gps;
        ImageView image;
        EditText search;
    }
    class NewaViewHolder{
        TextView name,sale,send,time;
        ImageView picture;
    }
}

