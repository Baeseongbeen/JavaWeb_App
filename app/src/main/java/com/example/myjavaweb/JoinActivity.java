package com.example.myjavaweb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class JoinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        Intent intent = getIntent();
        String id = intent.getExtras().getString("id");
        EditText etID = findViewById(R.id.etID);
        etID.setText(id);

        findViewById(R.id.btnOK).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.putExtra("result", "로그인에 성공하셨습니다.");
                setResult(RESULT_OK);

                finish();
            }
        });
    findViewById(R.id.btnCancel).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            setResult(RESULT_CANCELED);

            finish();
        }
    });
    }
}