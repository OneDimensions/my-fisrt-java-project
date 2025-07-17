package com.onedimension.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TCPServiceDemo3 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8082);

        // 响应网页的话就用线程池处理
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                3, 10,
                1000, TimeUnit.MICROSECONDS,
                new ArrayBlockingQueue<>(100),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        while (true) {
            Socket socket = serverSocket.accept();
            threadPoolExecutor.execute(new TCPServiceThreadRunnable(socket));
        }

    }
}

class TCPServiceThreadRunnable implements Runnable {
    public Socket socket;

    public TCPServiceThreadRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            PrintStream ps = new PrintStream(socket.getOutputStream());
            System.out.println("客户端" + socket.getInetAddress().getHostAddress() + "已连接");
            // 响应一个html文档
            ps.println("HTTP/1.1 200 OK");
            ps.println("Content-Type: text/html;charset=utf-8");
            ps.println();
            ps.println("<html>");
            ps.println("<body>");
            ps.println("<h1>你好世界</h1>");
            ps.println("</body>");
            ps.println("</html>");
            ps.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("客户端" + socket.getInetAddress().getHostAddress() + "已断开");
        }
    }
}