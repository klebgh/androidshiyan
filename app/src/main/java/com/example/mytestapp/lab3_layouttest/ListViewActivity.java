package com.example.mytestapp.lab3_layouttest;
import android.app.PendingIntent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mytestapp.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ListViewActivity extends AppCompatActivity{
    private Button selectedBtn;
    //  定义通知渠道ID
    private static final String CHANNEL_ID = "list_item_notification_channel";
    //定义权限请求码
    private static final int NOTIFICATION_PERMISSION_REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab3_listview);

        ListView listView=findViewById(R.id.list_view);
        selectedBtn = findViewById(R.id.selected_btn);
        createNotificationChannel();
        List<Map<String, Object>> dataList = new ArrayList<>();


        // 列表项1：图标（系统图标）+ 文本（"首页"）
        Map<String, Object> item1 = new HashMap<>();
        item1.put("icon", R.drawable.lion);  // 系统自带首页图标
        item1.put("text", "Lion");
        dataList.add(item1);

        // 列表项2：可继续添加其他项...
        Map<String, Object> item2 = new HashMap<>();
        item2.put("icon", R.drawable.tiger);
        item2.put("text", "Tiger");
        dataList.add(item2);


        Map<String, Object> item3 = new HashMap<>();
        item3.put("icon", R.drawable.monkey);
        item3.put("text", "Monkey");
        dataList.add(item3);

        Map<String, Object> item4 = new HashMap<>();
        item4.put("icon", R.drawable.dog);
        item4.put("text", "Dog");
        dataList.add(item4);

        Map<String, Object> item5 = new HashMap<>();
        item5.put("icon", R.drawable.cat);
        item5.put("text", "Cat");
        dataList.add(item5);

        Map<String, Object> item6 = new HashMap<>();
        item6.put("icon", R.drawable.elephant);
        item6.put("text", "Elephant");
        dataList.add(item6);

        String[] from = {"icon", "text"};
        int[] to = {R.id.iv_item_icon, R.id.tv_item_text};

        SimpleAdapter simpleAdapter = new SimpleAdapter(
                this,
                dataList,
                R.layout.lab3_item_simple_adapter,
                from,
                to
        );

        listView.setAdapter(simpleAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // 获取选中项的文本内容
                String selectedText = dataList.get(position).get("text").toString();

                selectedBtn.setText(selectedText);

                Toast.makeText(ListViewActivity.this, "选中了：" + selectedText, Toast.LENGTH_SHORT).show();

                view.setSelected(true);
                listView.setItemChecked(position, true);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    if (ActivityCompat.checkSelfPermission(ListViewActivity.this, android.Manifest.permission.POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED) {
                        sendNotification(selectedText, position); // 传入position
                    } else {
                        ActivityCompat.requestPermissions(ListViewActivity.this, new String[]{android.Manifest.permission.POST_NOTIFICATIONS}, NOTIFICATION_PERMISSION_REQUEST_CODE);
                    }
                } else {
                    sendNotification(selectedText, position); // 传入position
                }
            }
        });

    }
    private void createNotificationChannel() {
        // 仅Android 8.0（API 26）及以上需要创建渠道
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            // 渠道名称（用户在系统设置中看到的名称）
            CharSequence channelName = "列表项选中通知";
            // 渠道描述（用户在系统设置中看到的描述）
            String channelDescription = "单击列表项时发送的通知，显示选中的列表项内容";
            // 通知重要性（IMPORTANCE_DEFAULT：默认，有声音和振动；IMPORTANCE_LOW：无声音）
            int importance = NotificationManager.IMPORTANCE_DEFAULT;

            // 创建渠道实例
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, channelName, importance);
            channel.setDescription(channelDescription);

            // 获取通知管理器，注册渠道
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

    // 2. sendNotification（含日志、唯一ID、异常捕获）
    private void sendNotification(String selectedText, int position) {
        Log.d("NotificationTest", "触发通知，选中项：" + selectedText + "，位置：" + position);

        // 双重权限检查（避免极端情况）
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this, "通知权限未开启", Toast.LENGTH_SHORT).show();
            return;
        }

        // 构建PendingIntent
        PendingIntent pendingIntent = PendingIntent.getActivity(
                this,
                position, // 用position作为请求码，确保PendingIntent唯一
                getIntent(),
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE
        );

        // 构建通知（增加大图标，提升显示辨识度）
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setSmallIcon(R.mipmap.ic_launcher) // 通知栏小图标（必需）
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher)) // 通知详情页大图标（可选，提升显示）
                .setContentTitle("选中列表项：" + selectedText)
                .setContentText("已成功选中「" + selectedText + "」，点击返回应用")
                .setPriority(NotificationCompat.PRIORITY_HIGH) // 低版本兼容高优先级
                .setAutoCancel(true)
                .setContentIntent(pendingIntent);

        // 发送通知（用1000+position作为唯一ID）
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        try {
            notificationManager.notify(1000 + position, notificationBuilder.build());
        } catch (SecurityException e) {
            Toast.makeText(this, "通知权限已关闭，请在设置中开启", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}
