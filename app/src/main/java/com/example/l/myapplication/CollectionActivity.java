package com.example.l.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CollectionActivity extends AppCompatActivity {

    private ListView mListView;
    private List<NewsInfo> data;
    private CollectionAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collection_list);
        mListView= (ListView) findViewById(R.id.collection_listView);
        data=new ArrayList<>();
        initData();
        adapter=new CollectionAdapter(CollectionActivity.this,R.layout.collection,data);
        mListView.setAdapter(adapter);
    }

    private void initData() {
        for(int i=0;i<20;i++){
            data.add(new NewsInfo(R.mipmap.ic_launcher,"商家名","月售量","起送12|配送2","30分钟"));
        }
    }

}
