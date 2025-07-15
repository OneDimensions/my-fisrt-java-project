package com.onedimension.bufferedInputStream;

import java.io.*;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        try (
                InputStream fileInputStream = new FileInputStream("static/file/1.txt");
                OutputStream outputStream = new FileOutputStream("static/file/1_copy.txt");
                // 包装成 缓冲字节输入输出流, 自带8kb大小的缓冲区, 减少IO次数
                InputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
                OutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        ) {
            // 定义数据容器大小
            byte[] bytes = new byte[1024];
            // 实际读取字节
            int b;
            while ((b = bufferedInputStream.read(bytes)) != -1) {
                // 从数据容器中截取出数据，写入文件
                bufferedOutputStream.write(bytes, 0, b);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
