package com.onedimension.interfacedemo;

// 定义接口 不能实例化 只能被类实现
public interface InterfaceDemo {
    // JDK8 之前 接口中只能定义常量和 抽象方法
    // 定义常量 可以省略 public static final
    int MAX_SIZE = 100;

    // 抽象方法也可以省略 public abstract
    void print();

    // 也可以直接定义方法. 如果有方法体的话权限默认为：public
    // 这个方法只能通过接口来调用
     static void speak() {
        System.out.println("I am InterfaceDemo");
    }
}
