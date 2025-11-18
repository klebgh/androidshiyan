package com.example.mytestapp.lab3_layouttest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mytestapp.R;

public class AlertDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab3_alertdialogbutton_layout);


        Button showDialogBtn = findViewById(R.id.show_dialog_btn);

        showDialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. 加载自定义登录布局
                LayoutInflater inflater = LayoutInflater.from(AlertDialogActivity.this);
                View dialogView = inflater.inflate(R.layout.lab_3_alertdialog_layout, null);

                // 2. 创建AlertDialog.Builder并设置自定义视图
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertDialogActivity.this);
                builder.setTitle("登录"); // 对话框标题
                builder.setView(dialogView); // 将自定义布局设置为对话框内容

                AlertDialog dialog = builder.create();

                Button cancelBtn = dialogView.findViewById(R.id.btn_cancel);
                Button signInBtn = dialogView.findViewById(R.id.btn_sign_in);


                cancelBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // 执行取消逻辑：关闭对话框
                        dialog.dismiss();
                    }
                });

                signInBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        EditText usernameEt = dialogView.findViewById(R.id.username_et);
                        EditText passwordEt = dialogView.findViewById(R.id.password_et);
                        String username = usernameEt.getText().toString();
                        String password = passwordEt.getText().toString();

                        Toast.makeText(AlertDialogActivity.this,
                                "用户名：" + username + "，密码：" + password,
                                Toast.LENGTH_SHORT).show();

                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
    }
}
