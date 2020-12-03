package com.example.myjavaweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.LinkedHashMap;
import java.util.Map;

public class HomeActivity extends AppCompatActivity {

    private Map<String, Class<?>> buttons = new LinkedHashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        LinearLayout layout = findViewById(R.id.layoutMenu);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        DisplayMetrics dm = getResources().getDisplayMetrics();
        int size = Math.round(20* dm.density);
        params.topMargin = size;


        buttons.put("Main", MainActivity.class);
        buttons.put("Main2", MainActivity2.class);
        buttons.put("Photo", homework01.class);
        buttons.put("화면넘기기-로그인", LoginActivity.class);
        buttons.put("버튼배치", Mission01Activity.class);
        buttons.put("사진체인저", Mission04Activity.class);

        for (String key : buttons.keySet()){
            Button btn = new Button(this);
            btn.setText(key);
            btn.setLayoutParams(params);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(HomeActivity.this, buttons.get(key));
                    startActivity(intent);
                }
            });
            layout.addView(btn);
        }
    }
}