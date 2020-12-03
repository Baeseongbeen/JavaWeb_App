package com.example.myjavaweb;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.btnLogin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, JoinActivity.class);
                intent.putExtra("id", "tester");
                startActivityForResult(intent, 101);
            }
        });
        }
        @Override
        protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
            super.onActivityResult(requestCode, resultCode, data);
            if (requestCode == 101 && resultCode == RESULT_OK ) {
                Toast.makeText(getApplicationContext(), data.getStringExtra("result"),
                        Toast.LENGTH_LONG).show();
            } else{
                Toast.makeText(getApplicationContext(), "아이디와 패스워드가 틀립니다.",
                        Toast.LENGTH_LONG).show();
            }
        }



    }