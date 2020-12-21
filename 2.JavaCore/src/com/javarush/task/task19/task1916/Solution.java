package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String file1;
        String file2;

        InputStream in = System.in;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in))) {
            file1 = bufferedReader.readLine();
            file2 = bufferedReader.readLine();
        }

        List<String> linesFirst;
        List<String> linesSecond;

        linesFirst = getFileContentInList(file1);
        linesSecond = getFileContentInList(file2);

        partition(linesFirst, linesSecond);
        lines.forEach(lineItem -> System.out.printf("%s, %s%n", lineItem.line, lineItem.type));
    }

    private static void partition(List<String> original, List<String> modified) {
        while (true) {
            String currentItemOriginal;
            String currentItemModified;

            if (!original.isEmpty()) {
                currentItemOriginal = original.get(0);
            } else {
                removed(modified, modified.get(0), Type.ADDED);
                break;
            }

            if (!modified.isEmpty()) {
                currentItemModified = modified.get(0);
            } else {
                removed(original, currentItemOriginal, Type.REMOVED);
                break;
            }
            //SAME
            if (currentItemModified.equals(currentItemOriginal)) {
                lines.add(new LineItem(Type.SAME, currentItemOriginal));
                removeTwoList(original, modified, currentItemOriginal);

            } else {
                //ADDED
                if (!checkNextItem(currentItemModified, original)) {
                    lines.add(new LineItem(Type.ADDED, currentItemModified));
                    modified.remove(currentItemModified);
                }
                //REMOVED
                else {
                    removed(original, currentItemOriginal, Type.REMOVED);
                }
            }
            if (modified.size() == 0 && original.size() == 0) {
                return;
            }
        }
    }

    private static void removed(List<String> original, String currentItemOriginal, Type type) {
        lines.add(new LineItem(type, currentItemOriginal));
        original.remove(currentItemOriginal);
    }

    private static void removeTwoList(List<String> original, List<String> modified, String currentItemOriginal) {
        modified.remove(currentItemOriginal);
        original.remove(currentItemOriginal);
    }

    private static boolean checkNextItem(String s, List<String> list) {
        if (1 <= list.size() - 1) {
            String shiftItem = list.get(1);
            return s.equals(shiftItem);
        }
        return false;
    }

    private static List<String> getFileContentInList(String file) throws IOException {
        List<String> linesString = new ArrayList<>();
        String line;
        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        while (fileReader.ready()) {
            line = fileReader.readLine();
            linesString.add(line);
        }
        fileReader.close();
        return linesString;
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME       //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
