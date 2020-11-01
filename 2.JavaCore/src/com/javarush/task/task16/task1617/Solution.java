package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

import java.util.Date;

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            while (!isInterrupted()) {
                if(numSeconds > 0) {
                System.out.print(numSeconds + " ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.print("Прервано!");
                        interrupt();
                     
                    }
                }
               else {
                    System.out.print("Марш!");
                    interrupt();
                }
                numSeconds--;
            }
        }
    }
}
