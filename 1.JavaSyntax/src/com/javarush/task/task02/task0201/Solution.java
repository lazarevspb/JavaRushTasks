package com.javarush.task.task02.task0201;


import java.util.Collections;

/*
Реализуем метод print
Требования:
1. Программа должна выводить текст на экран.
2. Метод main не должен вызывать System.out.println или System.out.print.
3. Метод print должен выводить текст на экран.
4. Метод main должен вызвать метод print класса Solution ровно три раза.
5. Метод print должен выводить на экран переданную строку 4 раза. Каждый раз с новой строки.
*/
public class Solution {

    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java is object-oriented!");
        print("Java is platform-independent!");
    }

    public static void print(String s) {
        Collections.nCopies(4, s + "\n").forEach(System.out::printf);
    }
}
