package com.onedimension.api;

public class StringBuildDemo {
    public static void main(String[] args) {
        // string字符串每次拼接都会创建一个新的对象 性能差
        // 定义字符串可以用string对象, 但是操作字符串建议用stringBuilder对象

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("abc");
        }
        // 恢复成字符串
        String s1 = sb.toString();
        System.out.println(s1);
    }
}
