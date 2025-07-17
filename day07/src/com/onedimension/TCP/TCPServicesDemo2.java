package com.onedimension.TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServicesDemo2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8081);

        // 利用多线程处理连接多个客服端 每当一个客户端连接，就会创建一个线程处理
        while (true) {
            Socket socket = serverSocket.accept();
            new TCPServiceThread(socket).start();
        }

    }
}

class TCPServiceThread extends Thread {
    public Socket socket;

    public TCPServiceThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            System.out.println("客户端" + socket.getInetAddress().getHostAddress() + "已连接");
            while (true) {
                String msg = dis.readUTF();
                System.out.println("接收客户端:" + socket.getInetAddress().getHostAddress() + "发送的数据: " + msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("客户端" + socket.getInetAddress().getHostAddress() + "已断开");
        }
    }
}