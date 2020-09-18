package com.javarush.task.task01.task0127;

/* 
Число в квадрате

Напиши программу, которая выводит на экран квадрат числа 5 с помощью метода sqr.

Подсказка:
В class Solution уже есть метод sqr, который считает квадрат числа.
Чтобы вызвать метод sqr со значением 5, напиши sqr(5).

Требования:
1. Программа должна выводить число.
2. Метод main должен вызывать метод sqr с параметром 5.
3. Метод main должен выводить результат метода sqr.
4. Метод sqr изменять нельзя.
5. Выводимое число должно соответствовать заданию.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sqr(5));
        //напишите тут ваш код
    }

    public static int sqr(int a) {
        return a * a;
    }
}
