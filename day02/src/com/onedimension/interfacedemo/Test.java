package com.onedimension.interfacedemo;

public class Test {
    public static void main(String[] args) {
        InterfaceImplement i = new InterfaceImplement();
        i.print();
        i.show();
        // 调用接口的方法
        i.interfaceMethod();
        // 接口中定义的静态方法只能通过接口来调用
        // i.speak();
    }
}
