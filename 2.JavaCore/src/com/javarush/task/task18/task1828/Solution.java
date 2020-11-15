package com.javarush.task.task18.task1828;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* 
Прайсы 2
*/

public class Solution {
    public static class Product {
        int id;
        String productName;
        String price;
        String quantity;

        @Override
        public String toString() {
            String result = String.format("%-8d%-30s%-8s%-4s\n", id, productName, price, quantity);
            return result;
        }

        public Product(int id, String productName, String price, String quantity) {
            this.id = id;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }
    }

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }
        List<Product> products = new ArrayList<>();
        InputStream in = System.in;
        String fileName;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));) {
            fileName = bufferedReader.readLine();

            StringBuilder sb = getStringBuilder(fileName);
            String[] lines = getLineString(sb);

            for (int i = 0; i < lines.length; i++) {
                products.add(getProduct(lines[i]));
            }

            int id = Integer.parseInt(args[1].trim());

            if (args[0].equals("-u")) {
                String productName = args[2];
                String price = args[3];
                String quantity = args[4];

                products.stream()
                        .filter(product -> product.id == id)
                        .map(product -> { product.productName = productName;
                                product.price = price;
                            product.quantity = quantity;
                            return product;
                        }).count();

                writeFile(products, fileName);
            } else if (args[0].equals("-d")) {
                for (int i = 0; i < products.size(); i++) {
                    if (products.get(i).id == id){
                        products.remove(i);
                    }
                }
                writeFile(products, fileName);

            }else System.out.println("Аргументы не определены");
        }
    }

    protected static void writeFile(List<Product> products, String fileName) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName, false);

        products.stream()
                .forEach(product -> {
                    try {
                        fileWriter.write(product.toString());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

        fileWriter.close();
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

}
