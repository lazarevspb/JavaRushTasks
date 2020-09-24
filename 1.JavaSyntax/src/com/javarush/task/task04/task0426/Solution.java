package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());

        if (i !=0) {
            if(i % 2 == 0){
                if(i > 0) System.out.print("положительное четное число");
                else System.out.print("отрицательное четное число");
            } else {
                if(i < 0) System.out.print("отрицательное нечетное число");
                else System.out.print("положительное нечетное число");
            }
        }else System.out.print("ноль");
    }
}
