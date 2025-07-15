package com.onedimension.fileInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args){
        // 1.固定读取单个字节 读取效率低 中文乱码
        // 创建输入流管道
        try (InputStream inputStream1 = new FileInputStream("static/file/1.txt")) {
            int b;
            while ((b = inputStream1.read()) != -1) {
                System.out.print((char) b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // 2.使用字节数组读取 效率比上面高一些 有可能会截断中文 但是还是没法解决中文乱码的问题
        try (InputStream inputStream2 = new FileInputStream("static/file/1.txt")) {
            byte[] bytes = new byte[3];
            // 记录每次实际读取的字节数
            int len;
            // 用bytes来装置每次读取的字节
            while ((len = inputStream2.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, len));
            }
            inputStream2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
