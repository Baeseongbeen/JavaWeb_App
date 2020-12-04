package com.example.myjavaweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ChatLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_login);

        EditText et = findViewById(R.id.etNickname);
        findViewById(R.id.btnChatLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nick = et.getText().toString().trim();
                if (nick.equals("")) return;

                Intent intent = new Intent(ChatLoginActivity.this, ChatActivity.class);
                intent.putExtra("nick", nick);
                startActivity(intent);

            }
        });
    }
}