package com.example.myjavaweb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {

    List<ChatItem> items = new ArrayList<>();
    ChatAdapter adapter;
    String nick = "";

    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg){
            String addr = "http://wik.iptime.org:8080/cmsgs/list/0.json";
            AsyncDownThread thread = new AsyncDownThread(addr, getChatMsgHandler);
            thread.start();

            mHandler.sendEmptyMessageDelayed(0, 3000);
        }
    };
    private Handler getChatMsgHandler = new Handler(){

        @Override
        public void handleMessage(@NonNull Message msg) {
            String json = (String) msg.obj;
            try {
                JSONArray ja = new JSONArray(json);
                for (int i = 0; i < ja.length(); i++){
                    JSONObject jo = ja.getJSONObject(i);
                    String nickname = jo.getString("user_nickname");
                    String usermsg = jo.getString("user_msg");
                    if ( nick.equals(nickname))
                        items.add(new ChatItem("", usermsg) );
                    else
                        items.add(new ChatItem(usermsg, "") );
                }
            }catch(JSONException e){
                e.printStackTrace();
            }

            adapter.notifyDataSetChanged();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        nick = getIntent().getExtras().getString("nick", "guest");
        Toast.makeText(this, nick + "님 반값습니다.", Toast.LENGTH_LONG).show();

        adapter = new ChatAdapter(this, R.layout.chat_list_item, items);
        ListView lv = findViewById(R.id.lvChatMsg);
        lv.setAdapter(adapter);

        EditText et = findViewById(R.id.etChattingMsg);
        findViewById(R.id.btnChatting).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String addr = "http://wik.iptime.org:8080/cmsgs/list/0.json";
                AsyncDownThread thread = new AsyncDownThread(addr, getChatMsgHandler);
                thread.start();

//                String msg = et.getText().toString().trim();
//                if (msg.equals("")) return;
//                items.add(new ChatItem("", msg) );
//                adapter.notifyDataSetChanged();
//                et.setText("");
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        mHandler.sendEmptyMessage(0);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mHandler.removeMessages(0);
    }
}