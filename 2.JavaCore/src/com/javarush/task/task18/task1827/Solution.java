package com.javarush.task.task18.task1827;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

/* 
Прайсы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Product> products = new ArrayList<>();
        InputStream in = System.in;
        String fileName;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));) {
            fileName = bufferedReader.readLine();
            FileWriter fileWriter = new FileWriter(fileName, true);
            StringBuilder sb = getStringBuilder(fileName);
            String[] lines = getLineString(sb);

            for (int i = 0; i < lines.length; i++) {
                products.add(getProduct(lines[i]));
            }

            if (args.length == 0) return;
            else if (args[0].equals("-c")) {
                Integer maxId = products
                        .stream()
                        .max(Comparator.comparing(Product::getId))
                        .get().id;

                if (args.length == 3) {
                    int id = Integer.parseInt(args[1].trim());
                    products.add(new Product(maxId >= id ? ++maxId : id, args[2], args[3], args[4]));
                    fileWriter.write(products.get(products.size() - 1).toString());
                } else {
                    products.add(new Product(++maxId, args[1], args[2], args[3]));
                    fileWriter.write(products.get(products.size() - 1).toString());
                }

            } else System.out.println("Аргументы не определены");
            fileWriter.close();
        }
    }

    public static Product getProduct(String line) {
        Integer id = Integer.parseInt(line.subSequence(0, 8).toString().trim());
        String productName = (String) line.subSequence(8, 38);
        String price = (String) line.subSequence(38, 46);
        String quantity = (String) line.subSequence(46, line.length() == 50 ? 50 : line.length());
        Product product = new Product(id, productName, price, quantity);
        return product;
    }

    protected static String[] getLineString(StringBuilder sb) {
        String text = sb.toString();
        String[] lines = text.split("\\r?\\n");
        return lines;
    }

    protected static StringBuilder getStringBuilder(String file) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (InputStreamReader in = new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8)) {
            int x;
            while ((x = in.read()) != -1) {
                stringBuilder.append((char) x);
            }
        }
        return stringBuilder;
    }

    public static class Product {
        int id;
        String productName;
        String price;
        String quantity;

        int getId() {
            return this.id;
        }

        @Override
        public String toString() {
            /*Объяснение строки форматирования:
            -8d - число, 8 символов, дополняется пробелами слева (об этом говорит минус перед числом).
            -30s - строка, 30 символов, дополняется пробелами слева.
            -8.2f - число с плавающей точкой, 8 символов, 2 из них после точки, дополняется слева пробелами.
            -4d - число, 4 символа, дополняется слева.*/

            String result = String.format(System.lineSeparator() + "%-8d%-30s%-8s%-4s", id, productName, price, quantity);
            return result;
        }

        public Product(int id, String productName, String price, String quantity) {
            this.id = id;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }
    }
}