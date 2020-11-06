package com.javarush.task.task16.task1630;

import java.io.*;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static {
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);

        f.start();
        f.join();


        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        File file;
        FileReader fileReader;
        StringBuilder stringBuilder = new StringBuilder();

        @Override
        public void run() {


            try {
                fileReader = new FileReader(file);
                try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                    while (bufferedReader.ready()) {
                        stringBuilder.append(bufferedReader.readLine()).append(" ");

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void setFileName(String fullFileName) {
            file = new File(fullFileName);
        }

        @Override
        public String getFileContent() {
            String s = stringBuilder.toString();
            return s;
        }
    }

}
