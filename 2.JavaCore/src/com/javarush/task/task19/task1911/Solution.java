package com.javarush.task.task19.task1911;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Ридер обертка
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out; //запоминаем настоящий PrintStream в специальную переменную

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); //Создаем динамический массив
        PrintStream stream = new PrintStream(byteArrayOutputStream);  //создаем адаптер к классу PrintStream
        System.setOut(stream); // переопределяем System.out, для записи в наш файл вместо консоли

        testString.printSomething();    //Вызываем функцию, которая ничего не знает о наших манипуляциях

        String result = byteArrayOutputStream.toString();  //Преобразовываем записанные в наш ByteArray данные в строку

        System.setOut(printStream); //Возвращаем все как было

        System.out.println(result.toUpperCase());




    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
