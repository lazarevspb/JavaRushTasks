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
//             BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())))) {
             BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream("file0")))) {
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
        List<String> reultList = new ArrayList<>();


        int count = 0;
        int countSearch = 1;
        int size = list.size();
        while (!(size == reultList.size())) {
            char endCharFirstString;

            if (reultList.size() == 0) {
                endCharFirstString = Character.toLowerCase(list.get(count).charAt(list.get(count).length() - 1));
//            } else endCharFirstString = Character.toLowerCase(builder.charAt(builder.length() - 2));
            } else {
                String s = reultList.get(reultList.size()-1);
                endCharFirstString = Character.toLowerCase(s.charAt(s.length()-1));
            }
            if(list.size() > 0){
                String s = list.get(countSearch);
            char firstCharSecondString = Character.toLowerCase(s.charAt(0));
                if (endCharFirstString == firstCharSecondString) {
                    String firstWord;
                    String secondWord;
                    secondWord = list.get(countSearch);

                    if (builder.length() == 0) {
                        firstWord = list.get(0);
                        reultList.add(firstWord);
                        reultList.add(secondWord);
                        list.remove(firstWord);
                    } else {
                        secondWord = list.get(countSearch);
                        reultList.add(secondWord);
                    }


                    list.remove(secondWord);
//                count = 0;
                    countSearch = 0;
                } else {
                    countSearch++;

                    if (countSearch == list.size()) {
                        count++;
                        countSearch = 0;
                        list.addAll(reultList);
                        reultList.clear();
//                    if (count == 3)
//                        break;
                    }

                }
            } else {
                count++;
                countSearch = 0;
                list.addAll(reultList);
                reultList.clear();
            }



            if (list.size() == 1) {
//                reultList.add();
//                list.remove(list.get(0));
            }

        }
        System.out.println("list" +  list);
        System.out.println("reultList" + reultList);
        return builder;
    }
}
