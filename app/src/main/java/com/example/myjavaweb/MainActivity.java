package com.example.myjavaweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et = findViewById(R.id.etMsg);
        TextView tv = findViewById(R.id.tv_hello);
        Button btn = findViewById(R.id.btn);
        tv.setText("오후 시작");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = et.getText().toString();
                tv.setText(msg);
                et.setText("");
            }
        });

        Button call = findViewById(R.id.btnCall);
        call.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1111-2222"));
                startActivity(intent);
            }
        });

        Button web = findViewById(R.id.btnWeb);
        web.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kakaocorp.com"));
                startActivity(intent);
            }
        });

    }
}