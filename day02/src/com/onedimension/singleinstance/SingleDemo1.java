package com.onedimension.singleinstance;

/**
 * 单例模式
 * 只能创建一个对象
 * 此处为饿汉单例模式
 */
public class SingleDemo1 {
    // 创建这个类对象的静态成员变量, 并实例化类
    private static final SingleDemo1 instance = new SingleDemo1();

    // 私有化构造期,不允许外部创建对象
    private SingleDemo1() {}

    // 提供一个静态方法,返回单例对象,供外部访问此实例化的对象
    public static SingleDemo1 getInstance() {
        return instance;
    }
}
