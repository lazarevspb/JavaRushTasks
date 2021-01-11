package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())))) {
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

        if (words.length <= 1) return new StringBuilder();

        List<String> list = new ArrayList<>(Arrays.asList(words));
        List<String> reultList = new ArrayList<>();

        int count = 0;
        int countSearch = 1;
        int size = list.size();
        while (!(size == reultList.size())) {
            char endCharFirstString;
            if (reultList.size() == 0) {   //если первая итерация
                endCharFirstString = Character.toLowerCase(list.get(count).charAt(list.get(count).length() - 1));
            } else {
                String s = reultList.get(reultList.size() - 1);
                endCharFirstString = Character.toLowerCase(s.charAt(s.length() - 1));
            }
            if (list.size() > 0) {
                String s = list.get(countSearch);
                char firstCharSecondString = Character.toLowerCase(s.charAt(0));

                if (endCharFirstString == firstCharSecondString) { // проверка букв
                    String firstWord;
                    String secondWord;
                    secondWord = list.get(countSearch);

                    if (reultList.size() == 0) { // добавление на первой итерации
                        firstWord = list.get(0);
                        reultList.add(firstWord);
                        reultList.add(secondWord);
                        list.remove(firstWord);
                    } else {
                        secondWord = list.get(countSearch); // добавление
                        reultList.add(secondWord);
                    }


                    list.remove(secondWord);
                    countSearch = 0;
                } else {
                    countSearch++;
                    if (countSearch == list.size()) {
                        count = 0;
                        countSearch = 0;
                        list.addAll(reultList);
                        reultList.clear();
                    }
                }
            } else {
                count++;
                countSearch = 0;
                list.addAll(reultList);
                reultList.clear();
            }
        }

        StringBuilder builder = new StringBuilder(String.join(" ", reultList));
        return builder;
    }
}
