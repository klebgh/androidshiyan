package com.example.mytestapp.lab3_layouttest;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mytestapp.R;

public class MenuActivity extends AppCompatActivity {
    private TextView menuTextTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab3_menumain); // 加载你的主布局

        menuTextTest = findViewById(R.id.menutexttest);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.lab3_menu, menu); // 加载子菜单布局
        return true; // 显示菜单
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId(); // 获取菜单项的ID

        if (itemId == R.id.smallsize) {
            menuTextTest.setTextSize(10);
            Toast.makeText(this, "字体设置为小（10sp）", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.middlesize) {
            menuTextTest.setTextSize(16);
            Toast.makeText(this, "字体设置为中（16sp）", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.bigsize) {
            menuTextTest.setTextSize(20);
            Toast.makeText(this, "字体设置为大（20sp）", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.coloroption1) {
            menuTextTest.setTextColor(getResources().getColor(R.color.red));
            Toast.makeText(this, "字体颜色设置为红色", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.coloroption2) {
            menuTextTest.setTextColor(getResources().getColor(R.color.black));
            Toast.makeText(this, "字体颜色设置为黑色", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.submenu_option2) {
            Toast.makeText(this, "这是普通菜单项", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
