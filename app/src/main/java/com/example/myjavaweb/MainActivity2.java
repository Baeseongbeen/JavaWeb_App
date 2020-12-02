package com.example.myjavaweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private  int cnt = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button count = findViewById(R.id.btnCnt);
        TextView tv = findViewById(R.id.tvCnt);

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt++;

                tv.setText(cnt + ""); // 문자열 + 숫자는 문자열
            }
        });
    }
}