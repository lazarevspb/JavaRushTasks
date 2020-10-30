package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static CanFly result;

    public static void reset() throws IOException {
        InputStream in = System.in;
        String s;
        int i;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {
          s = bufferedReader.readLine().trim();
          if(s.equals("helicopter")) result = new Helicopter();
          else {
              i = Integer.parseInt(bufferedReader.readLine());
              result = new Plane(i);
          }
        }
        //add your code here - добавьте код тут
    }
}
