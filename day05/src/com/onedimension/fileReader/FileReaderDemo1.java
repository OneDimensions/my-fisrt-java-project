package com.onedimension.fileReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo1 {
    public static void main(String[] args) {
        // 创建读取管道
        try (Reader reader = new FileReader("static/file/1.txt")) {
            char[] chars = new char[1024];
            int len;
            while ((len = reader.read(chars)) != -1) {
                System.out.print(new String(chars, 0, len));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
