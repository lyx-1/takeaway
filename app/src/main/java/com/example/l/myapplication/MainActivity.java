package com.example.l.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private EditText accountEdit;
    private EditText passwordEdit;
    private Button login;
    private Button register;
    private CheckBox rememberPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        pref= PreferenceManager.getDefaultSharedPreferences(this);
        accountEdit=(EditText)findViewById(R.id.edit_account);
        passwordEdit=(EditText)findViewById(R.id.edit_password);
        login=(Button)findViewById(R.id.login);
        register=(Button)findViewById(R.id.register);
        rememberPass=(CheckBox)findViewById(R.id.remember_pass);
        boolean isRememberPassword=pref.getBoolean("remember_password",false);
        if(isRememberPassword){
            String password=pref.getString("password","");
            passwordEdit.setText(password);
            rememberPass.setChecked(true);
        }
            String account=pref.getString("account","");
            accountEdit.setText(account);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String account=accountEdit.getText().toString();
                String password=passwordEdit.getText().toString();
                if (account.equals("admin" )&& password.equals("123456")) {
                    editor=pref.edit();
                    editor.putString("account",account);
                    if(rememberPass.isChecked()){
                        editor.putBoolean("remember_password",true);
                        editor.putString("password",password);
                    }
                    else{
                        editor.clear();
                    }
                    editor.commit();
                    Intent intent=new Intent(MainActivity.this,TakeawayActivity.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(MainActivity.this,"账户信息不正确", Toast.LENGTH_SHORT).show();
                }
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}