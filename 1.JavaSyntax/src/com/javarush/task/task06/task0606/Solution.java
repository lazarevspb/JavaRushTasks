package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] cArr = reader.readLine().toCharArray();


        for (int i = 0; i < cArr.length; i++) {
            int var = Integer.parseInt(String.valueOf(cArr[i]));
            if (var % 2 == 0) even++;
            else odd++;
        }
        System.out.printf("Even: %d Odd: %d", even, odd);
    }
}

//
//package com.javarush.task.task06.task0606;
//
//        import java.io.BufferedReader;
//        import java.io.IOException;
//        import java.io.InputStreamReader;
//
//public class Solution {
//
//    public static int even;
//    public static int odd;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int count = Integer.parseInt(reader.readLine());
//        while (count > 0) {
//            if (count % 2 == 0) {
//                even++;
//            } else {
//                odd++;
//            }
//            count = count / 10;
//        }
//
//        System.out.println("Even: " + even + " Odd: " + odd);
//    }
//}
