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
public class AddAddress extends Activity implements View.OnClickListener {
    private ImageView back;
    private Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add);

        Intent build=getIntent();

        back=(ImageView)findViewById(R.id.back);
        back.setOnClickListener(this);

        ok=(Button)findViewById(R.id.ok);
        ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ok:
                Intent addAddressSure=new Intent(AddAddress.this,Address.class);

                startActivity(addAddressSure);
                break;
            case R.id.back:
                this.finish();
                break;
        }
       /* Intent addAddressBack=new Intent(AddAddress.this,Address.class);
        startActivity(addAddressBack);*/



    }
}
