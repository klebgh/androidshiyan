package com.example.mytestapp.lab3_layouttest;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mytestapp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContextmenuActivity extends AppCompatActivity {

    private ListView mListView;
    private List<Map<String, Object>> mDataList;
    private SimpleAdapter mAdapter;
    private ActionMode mActionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab3_contextlistview_layout);

        mListView = findViewById(R.id.list_view);

        mDataList = new ArrayList<>();
        String[] texts = {"One", "Two", "Three", "Four", "Five"};
        for (String text : texts) {
            Map<String, Object> item = new HashMap<>();
            item.put("icon", R.mipmap.ic_launcher);
            item.put("text", text);
            mDataList.add(item);
        }

        mAdapter = new SimpleAdapter(
                this,
                mDataList,
                R.layout.lab3_contextmenuadapter_layout,
                new String[]{"icon", "text"},
                new int[]{R.id.contextmenu_image, R.id.contextmenu_text}
        );

        mListView.setAdapter(mAdapter);
        mListView.setChoiceMode(AbsListView.CHOICE_MODE_MULTIPLE_MODAL); /

        mListView.setMultiChoiceModeListener(new AbsListView.MultiChoiceModeListener() {
            @Override
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                // 创建ActionMode时加载菜单
                MenuInflater inflater = mode.getMenuInflater();
                inflater.inflate(R.menu.lab3_menu_actionmode, menu);
                mActionMode = mode;
                return true;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                int selectedCount = mListView.getCheckedItemCount();
                mode.setTitle(selectedCount + " selected");
                return false;
            }

            @Override
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {

                if (item.getItemId() == R.id.action_delete) {

                    SparseBooleanArray checkedItems = mListView.getCheckedItemPositions();
                    List<Integer> positionsToRemove = new ArrayList<>();

                    for (int i = 0; i < checkedItems.size(); i++) {
                        if (checkedItems.valueAt(i)) {
                            positionsToRemove.add(checkedItems.keyAt(i));
                        }
                    }

                    for (int i = positionsToRemove.size() - 1; i >= 0; i--) {
                        mDataList.remove(positionsToRemove.get(i).intValue());
                    }

                    mAdapter.notifyDataSetChanged(); // 刷新列表
                    mode.finish(); // 关闭ActionMode
                    Toast.makeText(ContextmenuActivity.this, "已删除选中项", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode mode) {
                mListView.clearChoices();
                mAdapter.notifyDataSetChanged();
                mActionMode = null;
            }

            @Override
            public void onItemCheckedStateChanged(ActionMode mode, int position, long id, boolean checked) {
                mode.setTitle(mListView.getCheckedItemCount() + " selected");
            }
        });
    }
}
