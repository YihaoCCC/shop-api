package com.example.shop.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public  class DateUtils {
    public static String getNowDate(){
        //LocalDate date = LocalDate.now();
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       // DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateStr = format.format(date);
        //String format = dateTimeFormatter.format(date);
        return  dateStr;
    }
    public static Date GetDate(String Date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time = null;
        try {
             time = format.parse(Date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return  time;
    }
}
