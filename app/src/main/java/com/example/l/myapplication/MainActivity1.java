package com.example.l.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.*;

public class MainActivity1 extends Activity implements View.OnClickListener {
    private TextView name;
    private TextView birthday;
    private TextView address;
    private TextView number;
    private TextView password;
    private TextView city;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_information);

        address=(TextView)findViewById(R.id.address);
        address.setOnClickListener(this);


        birthday=(TextView)findViewById(R.id.birth);
        birthday.setOnClickListener(this);


        city=(TextView)findViewById(R.id.city) ;
        city.setOnClickListener(this);

        name=(TextView)findViewById(R.id.name);
        name.setOnClickListener(this);

        number=(TextView)findViewById(R.id.number);
        number.setOnClickListener(this);

        password=(TextView)findViewById(R.id.password);
        password.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.name:
                Intent nameMarch=new Intent(MainActivity1.this,Name.class);
                startActivity(nameMarch);
                break;
            case R.id.birth:
                Intent birthday=new Intent(MainActivity1.this,Birthday.class);
                startActivity(birthday);
                break;
            case R.id.address:
                Intent address=new Intent(MainActivity1.this,Address.class);
                startActivity(address);
                break;
            case R.id.number:
                Intent number=new Intent(MainActivity1.this, Number.class);
                startActivity(number);
                break;
            case R.id.password:
                Intent password=new Intent(MainActivity1.this,Password.class);
                startActivity(password);
                break;

        }








    }

}
