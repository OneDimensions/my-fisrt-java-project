package com.onedimension.enumdemo;

public class Test {
    public static void main(String[] args) {
        EnumDemo1 e1 = EnumDemo1.X;
        // 本质上是调了枚举类的toString()方法,拿到枚举常量的名称
        System.out.println(e1);
    }
}
