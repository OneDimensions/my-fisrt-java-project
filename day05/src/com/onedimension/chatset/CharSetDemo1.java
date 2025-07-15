package com.onedimension.chatset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "你好啊abc123";
        byte[] bytes = str.getBytes(); // 默认使用UTF-8编码
        // 指定编码
        byte[] bytes1 = str.getBytes("GBK");
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));
        System.out.println(bytes1.length);

        // 解码
        String str1 = new String(bytes);
        // 编码和解码的字符集必须一致
        String str2 = new String(bytes1, "GBK");
        System.out.println(str1);
        System.out.println(str2);
    }
}
