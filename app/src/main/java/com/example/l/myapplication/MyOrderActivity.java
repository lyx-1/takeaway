package com.example.l.myapplication;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MyOrderActivity extends AppCompatActivity {

    FragmentManager manager;
    Fragment_ordered ordered;
    Fragment_ordering ordering;
    private ListView mlistview;
    private List<Info> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        manager = getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();

        ordered=new Fragment_ordered();
        ordering=new Fragment_ordering();
        transaction.add(R.id.frame_order, ordered, "ordered");
        transaction.add(R.id.frame_order, ordering, "ordering");
        transaction.show(ordering);

        transaction.hide(ordered);
        transaction.commit();
    }

    public void click_order(View view) {
        FragmentTransaction tran=manager.beginTransaction();
        tran.hide(ordering);
        tran.hide(ordered);

        switch (view.getId()){
            case R.id.list_ordered:
                tran.show(ordered);
                tran.commit();
                break;
            case R.id.list_ordering:
                tran.show(ordering);
                tran.commit();
                break;
        }
    }
}
