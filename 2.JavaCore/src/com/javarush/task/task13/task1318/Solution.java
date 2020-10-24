package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName;
        InputStream in = System.in;
        BufferedReader bufferedReader;
        InputStream inputStream = null;
        BufferedInputStream buffer = null;


        bufferedReader = new BufferedReader(new InputStreamReader(in));
        fileName = bufferedReader.readLine();
        try {
            inputStream = new FileInputStream(fileName);
            buffer = new BufferedInputStream(inputStream);
            while (buffer.available() > 0) {
                char c = (char) buffer.read();
                System.out.print(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {


            bufferedReader.close();
            inputStream.close();
            buffer.close();
        }


    }
}

/*public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);

        Scanner scanner = new Scanner(fileInputStream);
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()) {
            builder.append(scanner.nextLine()).append("\n");
        }

        System.out.print(builder.toString());

        scanner.close();
        reader.close();
    }
}

*/