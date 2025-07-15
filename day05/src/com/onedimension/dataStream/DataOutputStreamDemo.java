package com.onedimension.dataStream;

import java.io.*;

public class DataOutputStreamDemo {
    public static void main(String[] args) {

        // 特殊数据流 输出的时候能够带有原始数据类型, 读取的时候也能读取到原始数据类型
        // 需要包一个低级 流
        try (
                // 输出流
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("static/file/6.txt"));
                // 输入流
                DataInputStream dis = new DataInputStream(new FileInputStream("static/file/6.txt"));
        ) {

            dos.writeChar('s');
            dos.writeInt(18);
            dos.writeDouble(18.18);
            dos.writeUTF("hello world");
            dos.writeBoolean(true);

            System.out.println("写入完毕");

            // 读取的时候类型要与写入的一一对应
            System.out.println(dis.readChar());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
            System.out.println(dis.readUTF());
            System.out.println(dis.readBoolean());


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
