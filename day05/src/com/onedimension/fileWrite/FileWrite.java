package com.onedimension.fileWrite;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWrite {
    public static void main(String[] args) {
        // 写出的数据必须关闭流或者刷新流, 写出的数据才能生效
        try (Writer writer = new FileWriter("static/file/3.txt")) {
            writer.write("hello world");
            writer.write("\r\n");
            writer.write('h');
            writer.write("wqe".toCharArray());

            // 刷新缓冲区 将缓冲区的数据全部写入文件 流还能继续使用
            writer.flush();

            // 关闭包含刷新 不能再继续使用
            // writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
