package com.example.l.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class TakeawayActivity extends AppCompatActivity {

    Fragment1 fragment1;
    Fragment2 fragment2;
    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        manager=getSupportFragmentManager();
        final FragmentTransaction transaction=manager.beginTransaction();

        fragment1=new Fragment1();
        fragment2=new Fragment2();
        transaction.add(R.id.frame, fragment1, "fragment1");
        transaction.add(R.id.frame, fragment2, "fragment2");
        transaction.show(fragment1);
        transaction.hide(fragment2);
        transaction.commit();


    }

    public void click(View view) {
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.hide(fragment1);
        transaction.hide(fragment2);


        switch (view.getId()){
            case R.id.info:
                transaction.show(fragment1);
                transaction.commit();
                break;

            case R.id.user:
                transaction.show(fragment2);
                transaction.commit();
                break;
            case R.id.infomation:
                Intent intent1=new Intent(TakeawayActivity.this,MainActivity1.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.sale:
                Intent intent=new Intent(TakeawayActivity.this,MyOrderActivity.class);
                startActivity(intent);
                break;
            case R.id.shoucang:
                Intent intent2=new Intent(TakeawayActivity.this,CollectionActivity.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.addr:
                transaction.show(fragment1);
                transaction.commit();
                break;

        }
    }

}

