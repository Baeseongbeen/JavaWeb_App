package com.example.myjavaweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        List<String> items = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, items);
        ListView lv = findViewById(R.id.lvMsg);
        lv.setAdapter(adapter);

        items.add("아이언맨");

        for(int i= 0; i< 50; i++)
            items.add(i + "");

    }
}