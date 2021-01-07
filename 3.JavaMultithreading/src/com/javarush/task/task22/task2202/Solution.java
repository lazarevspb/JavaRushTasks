package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.print(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        String result;
        if (string == null) throw new TooShortStringException();
        String[] sArr = string.split(" ");
        System.out.println();
        try {
            if (string.chars().filter(value -> value == ' ').count() < 4) throw new TooShortStringException();
            result = String.format("%s %s %s %s", sArr[1], sArr[2], sArr[3], sArr[4]);
        } catch (Exception e) {
            throw new TooShortStringException();
        }
        return result;
    }

    public static class TooShortStringException extends RuntimeException {
        public TooShortStringException() {
        }
    }
}
