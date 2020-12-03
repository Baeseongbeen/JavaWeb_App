package com.example.myjavaweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    List<String> items = new ArrayList<>();
    ArrayAdapter<String> adapter;
    EditText etmsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        etmsg = findViewById(R.id.etMsgEx);

        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, items);
        ListView lv = findViewById(R.id.lvMsg);
        lv.setAdapter(adapter);


        items.add("채팅");
        findViewById(R.id.btnMsgSend).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = etmsg.getText().toString().trim();
                if(msg.equals(""))
                    return;

                etmsg.setText("");
                items.add(msg);
                adapter.notifyDataSetChanged();

            }
        });

    }
}