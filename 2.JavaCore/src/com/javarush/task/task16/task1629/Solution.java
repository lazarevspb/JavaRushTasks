package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* 
Только по-очереди!
*/

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException, IOException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();

        reader.close();
    }

    public static class Read3Strings extends Thread {
        private List<String> result = new ArrayList<String>();
        int count = 0;

        @Override
        public void run() {
            String s;
            try {
                while (count < 3) {
                    if ((s = reader.readLine()) != null) {
                        result.add(s);
                        count++;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void printResult() {
            result.forEach(s -> System.out.print(s + " "));
            System.out.println();
        }
    }
}
