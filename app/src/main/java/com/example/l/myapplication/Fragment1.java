package com.example.l.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
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

        list.add(new News("定位", R.drawable.sea, R.mipmap.flower));
        for (int i = 0; i < 20; i++) {
            list.add(new Newa1("香菇炖鸡", "月售112", "5分钟", "起送 12 | 配送 2", R.mipmap.ic_launcher));
        }

        mlistview= (ListView) view.findViewById(R.id.list_item);
        // initdata();
        mlistview.setAdapter(new MyAdapter(list,getActivity()));
        return  view;
    }

}
