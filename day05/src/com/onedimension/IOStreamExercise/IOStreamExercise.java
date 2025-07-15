package com.onedimension.IOStreamExercise;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IOStreamExercise {
    public static void main(String[] args) {

        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader("static/file/chushibiao_luanxu.txt"));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("static/file/chushibiao_zhengxu.txt"));

                // 使用字符输入转换流解决不同编码读取乱码问题
                // 创建原始字符输入流
                InputStream inputStream = new FileInputStream("static/file/chushibiao_luanxu.txt");
                // 指定字符集把原始字节流转换成字符输入流 指定编码字符集
                InputStreamReader irs = new InputStreamReader(inputStream, "utf-8");

        ) {
            List<String> content = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.add(line);
            }

            // content.forEach(System.out::println);

            content.sort((o1, o2) -> {
                int o1Start = Integer.parseInt(o1.substring(0, o1.indexOf("、")));
                int o2Start = Integer.parseInt(o2.substring(0, o2.indexOf("、")));
                return  o1Start - o2Start;
            });

            content.forEach(System.out::println);

            content.forEach(c -> {
                try {
                    bufferedWriter.write(c);
                    bufferedWriter.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });

            System.out.println("处理完毕");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
