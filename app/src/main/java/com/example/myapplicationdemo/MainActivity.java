package com.example.myapplicationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //生命控件
    private Button mBtnLogin;
    private EditText mEtUser;
    private EditText mEtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //找到控件
        mBtnLogin = findViewById(R.id.bat_login);
        mEtUser = findViewById(R.id.ed_1);
        mEtPassword = findViewById(R.id.ed_2);

//        //实现直接跳转--方法一
//        mBtnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//
//            public void onClick(View v) {
//                Intent intent = null;
//                intent = new Intent(MainActivity.this, FunctionActivity.class);
//                startActivity(intent);
//            }
//        });


        //匹配对应的用户名与密码才能进行登录操作
        mBtnLogin.setOnClickListener(this);

    }

    private void onClick() {
        //需要获取用户输入的用户名和密码
        String usermane = mEtUser.getText().toString();
        String password = mEtPassword.getText().toString();
        Intent intent = null;

        //弹出内容设置
        String ok = "登录成功!";
        String fail = "账号或密码错误，请重新登录!";

        //假设正确的账号与密码 是 123 123456
        if (usermane.equals("123") && password.equals("123456")) {

            //tosat普通版
            Toast.makeText(getApplicationContext(),ok,Toast.LENGTH_SHORT).show();

            //如果正确跳转页面
            intent = new Intent(MainActivity.this, FunctionActivity.class);
            startActivity(intent);
        }else {
            //弹出错误提示 toast
            //提升版，toast展示
            Toast toastCenter = Toast.makeText(getApplicationContext(), fail, Toast.LENGTH_SHORT);
            toastCenter.setGravity(Gravity.CENTER,0,0);
            toastCenter.show();
        }
    }

    @Override
    public void onClick(View v) {
        //需要获取用户输入的用户名和密码
        String usermane = mEtUser.getText().toString();
        String password = mEtPassword.getText().toString();
        Intent intent = null;

        //弹出内容设置
        String ok = "登录成功!";
        String fail = "账号或密码错误，请重新登录!";

        //假设正确的账号与密码 是 123 123456
        if (usermane.equals("123") && password.equals("123456")) {

            //tosat普通版
            Toast.makeText(getApplicationContext(),ok,Toast.LENGTH_SHORT).show();

            //如果正确跳转页面
            intent = new Intent(MainActivity.this, FunctionActivity.class);
            startActivity(intent);
        }else {
            //弹出错误提示 toast
            //提升版，toast展示
            Toast toastCenter = Toast.makeText(getApplicationContext(), fail, Toast.LENGTH_SHORT);
            toastCenter.setGravity(Gravity.CENTER,0,0);
            toastCenter.show();
        }
    }
}