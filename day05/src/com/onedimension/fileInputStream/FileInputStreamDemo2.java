package com.onedimension.fileInputStream;

import java.io.FileInputStream;
import java.io.InputStream;

// 读取文本适合字符流 字节流适合做数据的转移。比如复制
public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        // 解决中文乱码问题
        // 一种解决方案, 定义一个与文件大小一样的字节数组来读取, 避免每次读取的字节数组长度不够
        // 这种只适合小文件, 大文件读取时, 可能会出现内存溢出的问题
        InputStream inputStream1 = new FileInputStream("static/file/1.txt");
        // 如果文件内容超过内存容量, 会抛出异常
        byte[] bytes1 = inputStream1.readAllBytes();
        System.out.println(new String(bytes1));
    }
}
