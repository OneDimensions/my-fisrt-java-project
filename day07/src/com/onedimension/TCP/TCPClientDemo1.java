package com.onedimension.TCP;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建socket管道对象,请求与服务端的可靠连接 发送的ip和端口
        Socket socket = new Socket(InetAddress.getLocalHost(), 8081);

        System.out.println("客户端启动");

        // 从管道对象里获取字节输出流
        OutputStream outputStream = socket.getOutputStream();
        // 使用特殊数据流传输数据
        DataOutputStream dos = new DataOutputStream(outputStream);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入消息:");
            String msg = scanner.next();
            if ("exit".equals(msg)) {
                socket.close();
                break;
            }
            dos.writeUTF(msg);
            // 刷新缓冲区 将数据写入通道
            dos.flush();
        }


    }
}
