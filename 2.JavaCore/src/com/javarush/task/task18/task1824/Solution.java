package com.javarush.task.task18.task1824;

import java.io.*;

/* 
Файлы и исключения
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

        while (true) {
            String file = bufferedReader.readLine();

            try (FileInputStream fileInputStream = new FileInputStream(file)) {
            } catch (FileNotFoundException e) {
                System.out.println(file);
                break;

            }


        }
    }
}