package com.onedimension.bufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {

        // 创建字符缓冲输入流
        try (BufferedReader reader = new BufferedReader(new FileReader("static/file/1.txt"))) {
            // 按行进行读取
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 字符输出流bufferedWriter也是一样用法
        // 新增了换行方法 newLine()
    }
}
