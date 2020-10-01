package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            integerList.add(Integer.parseInt(reader.readLine()));
        }

        integerList.stream().sorted(Integer::compareTo).forEach(System.out::println);
    }
}

//
//    int[] array = new int[]{firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber};
//    sort(array);
//
//        for (int x : array) {
//                System.out.println(x);
//                }
//                }
//
//public static void sortArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//        for (int j = i; j < array.length; j++) {
//        if (array[i] > array[j]) {
//        int temp = array[i];
//        array[i] = array[j];
//        array[j] = temp;
//        }
//        }
//        }
//        }