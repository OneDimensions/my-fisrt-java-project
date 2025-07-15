package com.onedimension.fileOutputStream;

import java.io.*;

public class CopyFileDemo1 {
    public static void main(String[] args) throws IOException {
        try (
                // 自动资源释放 这里的资源使用完毕后会自动调用close方法关闭
                // 资源一般是实现了Closeable | AutoCloseable接口的类
                InputStream fileInputStream = new FileInputStream("static/file/1.txt");
                OutputStream outputStream = new FileOutputStream("static/file/1_copy.txt");
        ) {
            // 定义数据容器大小
            byte[] bytes = new byte[1024];
            // 实际读取字节
            int b;
            while ((b = fileInputStream.read(bytes)) != -1) {
                // 从数据容器中截取出数据，写入文件
                outputStream.write(bytes, 0, b);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
