package com.example.myjavaweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Mission04Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission04);

        ImageView imgA = findViewById(R.id.imgA);
        ImageView imgB = findViewById(R.id.imgB);

        findViewById(R.id.btnUp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgA.setImageResource(R.drawable.amanda2);
                imgB.setImageResource(R.drawable.amanda);
            }
        });
        findViewById(R.id.btnDown).setOnClickListener(v -> {
            imgA.setImageResource(R.drawable.amanda);
            imgB.setImageResource(R.drawable.amanda2);
        });

    }
}