package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String[] nameFile = new String[3];
        InputStream in = System.in;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {
            for (int i = 0; i < nameFile.length; i++) {
                nameFile[i] = bufferedReader.readLine().trim();
            }
            readWrite(nameFile[1], nameFile[0]);
            readWrite(nameFile[2], nameFile[0]);
        }
    }

    protected static void readWrite(String inFile, String outFile) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(inFile);
             FileOutputStream fileOutputStream0 = new FileOutputStream(outFile, true);
        ) {
            while (fileInputStream.available() > 0) {
                fileOutputStream0.write(fileInputStream.read());
            }
        }
    }
}
