package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/

import java.util.Arrays;

public class Solution {

    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) throw new TooShortStringException();
        String[] sArr;
        sArr = string.split("\t");
        if (sArr.length < 2 || string.chars().filter(value -> value == '\t').count() < 2)
            throw new TooShortStringException();
        return sArr[1];
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }

    public static class TooShortStringException extends Exception {
    }
}
