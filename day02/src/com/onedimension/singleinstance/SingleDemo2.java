package com.onedimension.singleinstance;

/**
 * 懒汉式单例模式
 * 用到时才创建对象
 */
public class SingleDemo2 {
    private static SingleDemo2 instance;

    private SingleDemo2() {

    }

    public static SingleDemo2 getInstance() {
        if(instance == null) {
            instance = new SingleDemo2();
        }
        return instance;
    }
}
