package com.example.l.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by DXH on 2016/8/28.
 */
public class Birthday extends Activity implements View.OnClickListener {
    private Button cancel;
    private Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.birth);

        Intent birthday=getIntent();

        cancel=(Button)findViewById(R.id.cancel);
        cancel.setOnClickListener(this);

        ok=(Button)findViewById(R.id.ok);
        ok.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cancel:
                this.finish();
                break;
            case R.id.ok :
                this.finish();
                break;
        }

    }
}
