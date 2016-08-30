package com.example.l.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by DXH on 2016/8/29.
 */
public class Address extends Activity implements View.OnClickListener {
    private Button build;
    private ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.address);

        build=(Button)findViewById(R.id.build);
        build.setOnClickListener(this);


        back=(ImageView)findViewById(R.id.back);
        back.setOnClickListener(this);

        Intent address=getIntent();

        Intent addAddressSure=getIntent();


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.build:
                Intent build=new Intent(Address.this,AddAddress.class);
                startActivity(build);
                break;
            case R.id.back:
                this.finish();
                break;

        }

       // Intent addressBack=new Intent(Address.this,MainActivity.class);
       // startActivity(addressBack);

    }
}
