package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byteArrayOutputStream);
        System.setOut(stream);
        testString.printSomething();
        String[] input = byteArrayOutputStream.toString().split(" ");
        System.setOut(printStream);
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[2]);
        String sign = input[1];
        int c;
        if (input[1].equals("+")) {
            c = a + b;
        } else if (input[1].equals("-")){
            c = a - b;
        } else {
            c = a * b;

        }
        System.out.printf("%d %s %d = %d", a, sign, b, c);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

