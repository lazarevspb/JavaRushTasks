package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();

//        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())))) {
//             BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream("file0")))) {
            while (fileReader.ready()) {
                list.add(fileReader.readLine());
            }
        }


        List<String> resultList = new ArrayList<>();
        for (String line : list) {
            StringTokenizer tokenizer = new StringTokenizer(line);
            while (tokenizer.hasMoreTokens()) {
                resultList.add(tokenizer.nextToken());
            }
        }

        StringBuilder result = getLine(getWords(resultList));
        System.out.println(result.toString());
    }

    private static String[] getWords(List<String> list) {
        String[] array = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder builder = new StringBuilder();
        if (words.length <= 1 ) return builder;

        List<String> list = new ArrayList<>(Arrays.asList(words));
        List<String> list = new ArrayList<>(Arrays.asList(words));


        int count = 0;
        int countSearch = 1;
        while (list.size() != 0) {
            char endCharFirstString;

            if (builder.length() == 0) {
                endCharFirstString = Character.toLowerCase(list.get(0).charAt(list.get(0).length() - 1));
            } else endCharFirstString = Character.toLowerCase(builder.charAt(builder.length() - 2));
            char firstCharSecondString = Character.toLowerCase(list.get(countSearch).charAt(0));

            if (endCharFirstString == firstCharSecondString) {
                String firstWord;
                String secondWord;
                secondWord = list.get(countSearch);

                if (builder.length() == 0) {
                    firstWord = list.get(0);
                    builder.append(firstWord).append(" ").append(secondWord).append(" ");
                    list.remove(firstWord);
                } else {
                    secondWord = list.get(countSearch);
                    builder.append(secondWord).append(" ");
                }


                list.remove(secondWord);
//                count = 0;
                countSearch = 0;
            } else {
                countSearch++;

                if (countSearch == list.size()) {
                    count++;
                    countSearch = 0;
                    if (count == 3)
                        break;
                }

            }

            if (list.size() == 1) {
                builder.append(list.get(0));
                list.remove(list.get(0));
            }

        }
        return builder;
    }
}
