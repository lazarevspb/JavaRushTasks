package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        HttpURLConnection conn;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMM dd, yyyy", locale);
        String dateString = reader.readLine().trim();
        Date date = simpleDateFormat.parse(dateString);
        System.out.println(simpleDateFormat2.format(date).toUpperCase());
    }
}
