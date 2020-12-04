package com.example.myjavaweb;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SampleAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<String> items;
    private LayoutInflater inflater;

    public SampleAdapter(Context context, int layout, List<String> items) {
        this.context = context;
        this.layout = layout;
        this.items = items;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = inflater.inflate(layout, parent, false);
        }

        TextView tvItem = convertView.findViewById(R.id.tvItem);
        TextView tvTime = convertView.findViewById(R.id.tvTime);
        ConstraintLayout bgLayout = convertView.findViewById(R.id.bgLayout);

        if(position %2 == 0){
            tvTime.setText( items.get(position) );
            bgLayout.setBackgroundColor(Color.argb(255,100,100,100));
            //            tv.setBackgroundColor(Color.argb(255, 100, 100, 100));
//            tv.setTextColor(Color.WHITE);
        }else{
            tvItem.setText(items.get(position));
        }

//        long now = System.currentTimeMillis();
//        Date date = new Date(now);
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd hh:mm:ss");
//        String time = simpleDateFormat.format(date);
//        tvTime.setText(time);

        return convertView;
    }
}
