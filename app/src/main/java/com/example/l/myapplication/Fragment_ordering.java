package com.example.l.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_ordering extends Fragment {


    private ListView mlist;
    private List<Info> data;
    public Fragment_ordering() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment_ordering, container, false);
        mlist= (ListView) view.findViewById(R.id.list_ordering);
        data=new ArrayList<>();


        for (int i = 0; i < 20; i++) {
            data.add(new Info("香菇炖鸡", "月售112", "5分钟", "起送 12 | 配送 2", R.mipmap.ic_launcher));
        }
        Log.d("111111",data.get(5).getName());

        mlist.setAdapter(new MyOrderAdapter(data,getActivity()));
        mlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(getActivity(),MyOrderInfoActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
