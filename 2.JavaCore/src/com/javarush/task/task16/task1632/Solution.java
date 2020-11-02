package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        myThread01 thread01 = new myThread01();
        myThread02 thread02 = new myThread02();
        myThread03 thread03 = new myThread03();
        myThread04 thread04 = new myThread04();
        myThread05 thread05 = new myThread05();

        threads.add(thread01);
        threads.add(thread02);
        threads.add(thread03);
        threads.add(thread04);
        threads.add(thread05);


    }

    public static void main(String[] args) throws InterruptedException {
    }


    public static class myThread05 extends Thread{
        int sum = 0;
        @Override
        public void run() {
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
                while (true) {
                    String s = bufferedReader.readLine();
                    if(s.equals("N")) break;
                    sum = sum + Integer.parseInt(s);

                }


            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }


    public static class myThread04 extends Thread implements Message {
        @Override
        public void run() {
            while (!isInterrupted()){

            }

        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }


    public static class myThread03 extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.currentThread().sleep(500);
                }

            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
//                e.printStackTrace();
            }
        }
    }


    public static class myThread02 extends Thread {
        @Override
        public void run() {
            try {
                Thread.currentThread().sleep(Integer.MAX_VALUE);

            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class myThread01 extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }


}