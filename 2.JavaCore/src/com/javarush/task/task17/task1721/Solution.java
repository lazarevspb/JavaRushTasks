package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        InputStream in = System.in;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {
            String fileNAme0 = bufferedReader.readLine().trim();
            String fileNAme1 = bufferedReader.readLine().trim();

            BufferedReader reader = new BufferedReader(new FileReader(new File(fileNAme0)));
            BufferedReader reader1 = new BufferedReader(new FileReader(new File(fileNAme1)));

//            allLines = Files.readAllLines(Paths.get(bufferedReader.readLine()));
//            allLines = Files.readAllLines(Paths.get(r.readLine()), Charset.forName("windows-1251"));
//            https://javadevblog.com/kak-chitat-s-fajla-v-java-s-pomoshh-yu-bufferedreader-scanner-files-i-filereader.html


            while (reader.ready()) {
                allLines.add(reader.readLine());
            }

            while (reader1.ready()) {
                forRemoveLines.add(reader1.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {


        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }


    }
}
