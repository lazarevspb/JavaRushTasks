package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> monthList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            monthList.add(new DateFormatSymbols(Locale.ENGLISH).getMonths()[i]);
        }

        String s = reader.readLine().trim();
        for (int i = 0; i < monthList.size(); i++) {
            if (monthList.get(i).equalsIgnoreCase(s)) {
                System.out.printf("%s is the %d month", monthList.get(i), i + 1);
                break;
            }
        }
    }
}
