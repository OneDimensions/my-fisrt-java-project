package com.onedimension.UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClientDemo1 {
    public static void main(String[] args) throws Exception {
        // 1. 创建发送端对象
        DatagramSocket socket = new DatagramSocket();

        // 2. 创建数据，并把数据打包
        byte[] bytes = "hello, UDP".getBytes();

        /**
         * 参数一:  发送的数据
         * 参数二:  数据的字节长度
         * 参数三:  指定接收端的ip地址
         * 参数四:  指定接收端的端口号
         */
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 8080);

        // 发送
        socket.send(datagramPacket);

        socket.close();
    }
}
