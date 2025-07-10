package com.onedimension.interfacedemo;

// 使用implements关键字实现接口, 一个类可以实现多个接口
// 实现类实现多个接口, 必须重写完所有接口的所有抽象方法
// 弥补了单继承的不足,方便拓展能力
public class InterfaceImplement implements InterfaceDemo2, InterfaceDemo {
    @Override
    public void print() {
        System.out.println("实现接口的print方法, 读取接口常量:" + InterfaceDemo.MAX_SIZE);
    }

    @Override
    public void show() {
        System.out.println("实现接口的show方法, 读取接口常量:" + InterfaceDemo2.MAX_SIZE);
        InterfaceDemo.speak();
    }
}
