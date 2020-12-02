package com.example.myjavaweb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SleepTime {
    public Date getDate() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date isDate = format.parse("12:00");

        System.out.println(isDate);

        return isDate;
    }
    public float getAVG() {
        return 0;
    }
}
