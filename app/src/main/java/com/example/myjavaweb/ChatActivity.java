package com.example.myjavaweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {

    List<ChatItem> items = new ArrayList<>();
    ChatAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        adapter = new ChatAdapter(this, R.layout.chat_list_item, items);
        ListView lv = findViewById(R.id.lvChatMsg);
        lv.setAdapter(adapter);

        EditText et = findViewById(R.id.etChattingMsg);
        findViewById(R.id.btnChatting).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String msg = et.getText().toString().trim();
                if (msg.equals("")) return;
                items.add(new ChatItem("", msg) );
                adapter.notifyDataSetChanged();
                et.setText("");
            }
        });
//        EditText et = findViewById(R.id.etChattingMsg);
//        Button bt = findViewById(R.id.btnChatting);
//        TextView tv = findViewById(R.id.lvTv);

//        bt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tv.setText((CharSequence) et);

//            }
//        });
    }
}