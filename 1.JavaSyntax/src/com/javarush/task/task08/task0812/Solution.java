package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> integers = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
        integers.add(Integer.parseInt(bufferedReader.readLine().trim()));
        }

        int tmp = integers.get(0);
        int count = 0;
        int tmpCount = 0;

        for (int i = 0; i < integers.size(); i++) {
            if( integers.get(i) == tmp) tmpCount++;
            else {

                tmpCount = 1;
                tmp = integers.get(i);
            }
            if(tmpCount > count){
                count = tmpCount;
            }
        }

        System.out.println(count);
//        integers.forEach(System.out::println);


    }
}