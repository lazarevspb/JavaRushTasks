package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();
    public static List<String> nonRepetitions = new LinkedList<>();
    public static List<String> sArr = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        String fileName;
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.ready()) {
                sArr.addAll(Arrays.asList(reader.readLine().split(" ")));
            }

            int count = 0;
            do {
                if (checkArr(sArr.get(count), sArr, count)) count = 0;
                else count++;
            } while (count < sArr.size());

            result.forEach(pair -> System.out.println(pair.first + " " + pair.second));
        }

    }

    private static boolean checkArr(String str, List<String> sArr, int index) {
        for (int i = 0; i < sArr.size(); i++) {
            if (isReverse(str, sArr.get(i)) && i != index && !str.equals("")) {
                Pair pair = new Pair();
                pair.first = str;
                pair.second = sArr.get(i);
                result.add(pair);
                if (i < sArr.size()) {
                    sArr.remove(sArr.get(i));
                }
                sArr.remove(str);
                return true;
            }
        }
        return false;
    }

    private static boolean isReverse(String firstStr, String otherString) {
        return getReverseString(firstStr).equals(otherString);
    }

    private static String getReverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
