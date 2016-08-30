package com.example.l.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_ordered extends Fragment {

    private ListView mlist;
    private List<Info> data;
    public Fragment_ordered() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment_ordered, container, false);
        mlist= (ListView) view.findViewById(R.id.list_ordered);
        data=new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            data.add(new Info("香菇炖鸡haha", "月售112", "5分钟", "起送 12 | 配送 2", R.mipmap.ic_launcher));
        }
        mlist.setAdapter(new MyOrderAdapter(data,getActivity()));
        return view;
    }

}
