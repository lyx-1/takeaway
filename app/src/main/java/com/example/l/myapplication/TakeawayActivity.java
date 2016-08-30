package com.example.l.myapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class TakeawayActivity extends AppCompatActivity {

    Fragment1 fragment1;
    Fragment2 fragment2;
    Fragment3 fragment3;
    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        manager=getSupportFragmentManager();
        final FragmentTransaction transaction=manager.beginTransaction();

        fragment1=new Fragment1();
        fragment2=new Fragment2();
        fragment3=new Fragment3();
        transaction.add(R.id.frame, fragment1, "fragment1");
        transaction.add(R.id.frame, fragment2, "fragment2");
        transaction.add(R.id.frame, fragment3, "fragment3");
        transaction.show(fragment1);
        transaction.hide(fragment2);
        transaction.hide(fragment3);
        transaction.commit();


    }

    public void click(View view) {
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.hide(fragment1);
        transaction.hide(fragment2);
        transaction.hide(fragment3);

        switch (view.getId()){
            case R.id.info:
                transaction.show(fragment1);
                transaction.commit();
                break;
            case R.id.order:
                transaction.show(fragment3);
                transaction.commit();
                break;
            case R.id.user:
                transaction.show(fragment2);
                transaction.commit();
                break;
            case R.id.infomation:
                transaction.show(fragment3);
                transaction.commit();
                break;
            case R.id.sale:
                transaction.show(fragment1);
                transaction.commit();
                break;
            case R.id.shoucang:
                transaction.show(fragment2);
                transaction.commit();
                break;
            case R.id.addr:
                transaction.show(fragment1);
                transaction.commit();
                break;

        }
    }

}

