package com.example.mytestapp.lab2_layouttest;

import android.app.Activity;  // 正确导入
import android.os.Bundle;

import com.example.mytestapp.R;

public class LinearLayoutActivity extends Activity {  // 正确继承
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab2_linear_layout);
    }
}