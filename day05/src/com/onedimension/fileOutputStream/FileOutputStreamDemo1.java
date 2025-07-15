package com.onedimension.fileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        // 创建写入管道
        // 追加模式
        OutputStream outputStream1 = new FileOutputStream("static/file/02.txt", true);
        // OutputStream outputStream1 = new FileOutputStream("static/file/02.txt");

        outputStream1.write(97); // 写入一个字节数据
        outputStream1.write('a');
        // outputStream1.write('来'); // 会乱码

        // 换行
        outputStream1.write("\r\n".getBytes());

        // 字符串转换成字节数组 再写入
        byte[] bytes1 = "你好hello world".getBytes();
        outputStream1.write(bytes1);

        // 写入一部分字节
        outputStream1.write(bytes1, 0, 3);

        // 关闭流
        outputStream1.close();
    }
}
