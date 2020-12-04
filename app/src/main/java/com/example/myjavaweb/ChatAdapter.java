package com.example.myjavaweb;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

public class ChatAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<ChatItem> items;
    private LayoutInflater inflater;

    public ChatAdapter(Context context, int layout, List<ChatItem> items) {
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

        TextView tvMy = convertView.findViewById(R.id.tvMyMsg);
        TextView tvOther = convertView.findViewById(R.id.tvOtherMsg);

        tvMy.setText(items.get(position).getMyMsg());
        tvOther.setText(items.get(position).getOtherMsg());

        return convertView;
    }
}
