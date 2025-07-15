package com.onedimension.printstreamDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) {

        // 创建打印流对象
        // 创建什么就打印什么
        try (
                PrintStream ps = new PrintStream("static/file/5.txt");
                // 如果需要追加,先包一个低级管道
                FileOutputStream fos = new FileOutputStream("static/file/5.txt", true);
                PrintStream ps1 = new PrintStream(fos);
        ) {
            ps.println(99);
            ps.println(3.14);
            ps.println('a');
            ps.println("hello world");
            ps.println(true);

            ps.println("啊数据");
            ps1.println("啊数据append");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
