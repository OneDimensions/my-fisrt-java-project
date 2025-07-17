package com.onedimension.TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServiceDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建服务端对象 serviceSocket 为服务端注册端口
        ServerSocket serverSocket = new ServerSocket(8080);

        // 阻塞方法, 等待客户端连接 一旦有客户端连接之后会返回一个socket管道对象
        Socket socket = serverSocket.accept();

        // 从这个客户端管道对象中获取特殊字节输入流 读取数据
        DataInputStream dis = new DataInputStream(socket.getInputStream());

        while (true) {
            String s = dis.readUTF();
            System.out.println("接收客户端:" + socket.getInetAddress().getHostAddress() + "发送的数据: " +  s);
        }
    }
}
