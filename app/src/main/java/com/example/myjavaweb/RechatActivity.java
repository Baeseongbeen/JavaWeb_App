package com.example.myjavaweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RechatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rechat);

        EditText et = findViewById(R.id.etChatMsg);
        TextView tv = findViewById(R.id.tvMsg);
        Button btn = findViewById(R.id.btnChatSend);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = et.getText().toString();
                tv.append(msg + "\n");
                et.setText("");
            }
        });
    }
}