package com.javarush.task.task18.task1822;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {
          File file = new File(bufferedReader.readLine().trim());

            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while((line = br.readLine()) != null){ // Чтение построчно через BufferedReader
                if(line.startsWith(args[0] + " ")) {

                    System.out.println(line);
                }
            }
            br.close();


        }
    }
}
