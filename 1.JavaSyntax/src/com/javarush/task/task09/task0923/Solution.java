package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     String s = reader.readLine().trim();
//     String s = "Мама мыла раму";
     StringBuilder upLine = new StringBuilder();
     StringBuilder downLine = new StringBuilder();
     char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
           if (chars[i] == ' '){
               continue;
           }
            if(isVowel(chars[i])){
                upLine.append(chars[i] + " ");
            } else {
                downLine.append(chars[i] + " ");
            }
        }
        System.out.println(upLine + "\n" + downLine);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}