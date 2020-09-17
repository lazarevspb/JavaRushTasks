package com.javarush.task.task01.task0114;

import java.util.stream.*;
import java.util.Collections;
/*
JavaRush. Learn once - use anywhere
Напиши программу, которая выводит на экран надпись: "JavaRush. Learn once - use anywhere" 10 раз.

Требования:
1. Программа должна выводить текст.
2. Текст должен начинаться с "JavaRush".
3. Текст должен заканчиваться на "use anywhere".
4. Текст должен состоять из 10 строк.
5. Выводимый текст должен соответствовать заданию.
*/

public class Solution {
    public static void main(String[] args) {
//    Collections.nCopies(9, "JavaRush. Learn once - use anywhere\n").forEach(System.out::printf);
//        Stream.of("JavaRush. Learn once - use anywhere").peek(System.out::println).count();
        for (int i = 0; i < 10; i++) {
            System.out.println("JavaRush. Learn once - use anywhere");
        }

    }
}
