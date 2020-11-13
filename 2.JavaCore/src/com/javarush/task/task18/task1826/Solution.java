package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream(args[1]);
             FileOutputStream out = new FileOutputStream(args[2])) {
            if (!(args[0].equals("-e") || args[0].equals("-d"))) return;
            if (args[0].startsWith("-d")) {
                while (in.available() > 0) {
                    out.write(in.read() - 1);
                }
            }
            if (args[0].startsWith("-e")) {
                while (in.available() > 0) {
                    out.write(in.read() + 1);
                }
            }
        }
    }
}
