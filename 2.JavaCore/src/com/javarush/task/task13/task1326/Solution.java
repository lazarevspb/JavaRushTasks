package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String fileName = reader.readLine().trim();
//        String fileName = "testNumberFile.txt";
        FileInputStream fileInputStream = new FileInputStream(fileName); //Создаётся объект типа FileInputStream, предназначенный для чтения байтов из файла.
        Scanner scanner = new Scanner(fileInputStream);
        List<Integer> list = new ArrayList();

        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            if(num % 2 == 0) {
               list.add(num);
           }
        }
        list.stream().sorted().forEach(System.out::println);

        scanner.close();
        reader.close();
    }
}


/*
BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
  while (reader.ready()) {
            String s = reader.readLine();
            System.out.println(s);

        }
*/