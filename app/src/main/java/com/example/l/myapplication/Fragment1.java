package com.example.l.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;



/**
 * Created by 田起光 on 2016/8/27.
 */

/**
 * A simple {@link Fragment} subclass.
 */
//此碎片用于显示首页
public class Fragment1 extends Fragment {


    private ListView mlistview;
    private ArrayList<Object> list;
    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment1, container, false);
        list=new ArrayList<Object>();
        initdata();
        mlistview= (ListView) view.findViewById(R.id.list_item);
        mlistview.setAdapter(new MyAdapter(list,getActivity()));
        mlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(),SaleActivity.class);
                startActivity(intent);
            }
        });
        return  view;
    }

    private  void initdata(){
        list.add(new News( R.drawable.sea, R.mipmap.flower));
        for (int i = 0; i < 20; i++) {
            list.add(new Info("香菇炖鸡", "月售112", "5分钟", "起送 12 | 配送 2", R.mipmap.ic_launcher));
        }
    }

}

