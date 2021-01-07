package com.javarush.task.task22.task2201;

/* 
Строки нитей или строковые нити? Вот в чем вопрос
*/

import java.util.Arrays;

public class Solution {
    public static final String FIRST_THREAD_NAME = "1#";
    public static final String SECOND_THREAD_NAME = "2#";
    private Thread thread1;
    private Thread thread2;
    private Thread thread3;

    public Solution() {
        initThreads();
    }

    public static void main(String[] args) {
        new Solution();
    }

    protected void initThreads() {
        this.thread1 = new Thread(new Task(this, "A\tB\tC\tD\tE\tF\tG\tH\tI"), FIRST_THREAD_NAME);
        this.thread2 = new Thread(new Task(this, "J\tK\tL\tM\tN\tO\tP\tQ\tR\tS\tT\tU\tV\tW\tX\tY\tZ"), SECOND_THREAD_NAME);
        this.thread3 = new Thread(new Task(this, "\t\t"), "3#");

        Thread.setDefaultUncaughtExceptionHandler(new OurUncaughtExceptionHandler());

        this.thread1.start();
        this.thread2.start();
        this.thread3.start();
    }

    /*
            1. Метод getPartOfString должен возвращать подстроку между первой и последней табуляцией.
            2. На некорректные данные getPartOfString должен бросить исключение:
            а) StringForFirstThreadTooShortException, если имя трэда FIRST_THREAD_NAME.
            б) StringForSecondThreadTooShortException, если имя трэда SECOND_THREAD_NAME.
            в) RuntimeException в других случаях.

            1. Метод getPartOfString() должен возвращать подстроку между первой и последней табуляцией строки
            string переданной ему в качестве первого параметра.
            2. В случае некорректных данных метод getPartOfString() должен бросить исключение
            StringForFirstThreadTooShortException, если имя трэда(threadName) Solution.FIRST_THREAD_NAME.
            3. В случае некорректных данных метод getPartOfString() должен бросить исключение
            StringForSecondThreadTooShortException, если имя трэда(threadName) Solution.SECOND_THREAD_NAME.
            4. В случае некорректных данных метод getPartOfString() должен бросить исключение
            RuntimeException, если имя трэда(threadName) не Solution.FIRST_THREAD_NAME или Solution.SECOND_THREAD_NAME.
    */
    public synchronized String getPartOfString(String string, String threadName) {
        String subString = null;
        try {
            subString = string.substring(string.indexOf("\t") + 1, string.lastIndexOf("\t"));
        } catch (Exception e) {
            if (threadName.equals(Solution.FIRST_THREAD_NAME)) throw new StringForFirstThreadTooShortException(e);
            else if (threadName.equals(Solution.SECOND_THREAD_NAME))
                throw new StringForSecondThreadTooShortException(e);
            else throw new RuntimeException(e);
        }
        return subString;
    }
}