package com.onedimension.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServiceDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建接受段对象
        DatagramSocket socket = new DatagramSocket(8080);

        // 创建数据包对象 负责接收对象。最大长度64kb
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        while (true) {
            // 接收数据, 将数据保存在packet中 阻塞方法
            socket.receive(packet);

            // 客户端ip
            String clientIp = packet.getAddress().getHostAddress();

            // 获取接收到的数据长度,进行截取
            int length = packet.getLength();

            // 查看数据
            System.out.println("服务端接收数据:" + "ip为:" + clientIp + "的数据: " + new String(buffer, 0, length));
        }
    }
}
