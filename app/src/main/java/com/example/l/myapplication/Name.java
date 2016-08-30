package com.example.l.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by DXH on 2016/8/28.
 */
public class Name extends Activity implements View.OnClickListener {
    private Button save;

    private EditText edit;
    private ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.name);

        Intent nameMarch=getIntent();
        edit=(EditText)findViewById(R.id.edit);
        save=(Button)findViewById(R.id.save);
        save.setOnClickListener(this);

        back=(ImageView)findViewById(R.id.back);
        back.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.save:
                if (!"".equals(edit.getText().toString())){
                   this.finish();
                    Toast.makeText(Name.this,"保存成功",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(Name.this,"你还未作修改",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.back:
                this.finish();
                break;
        }


    }
}
