package com.javarush.task.task18.task1805;

import java.io.*;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Set<Integer> set = new TreeSet<>();
        fillSet(set);
        set.forEach(integer -> System.out.print(integer + " "));
    }

    protected static void fillSet(Set<Integer> set) throws IOException {
        InputStream in = System.in;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {
          File file = new File(bufferedReader.readLine());
          try (FileInputStream fileInputStream = new FileInputStream(file)) {
            while(fileInputStream.available() > 0){
                set.add(fileInputStream.read());
            }
          }
        }
    }
}
