package com.example.l.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by DXH on 2016/8/30.
 */
public class Password extends Activity implements View.OnClickListener {
    private ImageView back;
    private Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.password);

        Intent password=getIntent();

        back=(ImageView)findViewById(R.id.back);
        back.setOnClickListener(this);

        ok=(Button)findViewById(R.id.ok);
        ok.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.back:
                this.finish();
                break;
            case R.id.ok:
                this.finish();
                break;
        }


    }
}
