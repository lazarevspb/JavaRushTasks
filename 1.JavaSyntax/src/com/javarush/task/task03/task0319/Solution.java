package com.javarush.task.task03.task0319;

import java.util.Scanner;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int money = scanner.nextInt();
        int sAge = scanner.nextInt();

        System.out.printf("%s получает %d через %d лет.", name, money, sAge);
    }
}
