package com.onedimension.inetAddress;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo1 {
    public static void main(String[] args) {
        // 1. 获取本机地址
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println(address.getHostName());
            System.out.println(address.getHostAddress());

            // 获取对方 地址
            InetAddress address1 = InetAddress.getByName("www.baidu.com");
            System.out.println(address1.getHostName());
            System.out.println(address1.getHostAddress());

            // 判断本机与对方网络是否连通
            System.out.println(address.isReachable(5000));

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
