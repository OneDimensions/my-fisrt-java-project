package com.onedimension.staticmethod;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    // 如果一个工具类没有实例化的必要, 可以直接私有化构造器,这样外部无法创建对象

    // 静态方法定义
    // 规范: 如果这个方法只是为了做一个功能且不需要直接访问对象的数据,就定义成静态方法
    // 应用场景: 写一个工具类
    // 优点: 不需要实例化, 调用方便
    // 不能访问对象数据 不能有this
    public static void print() {
        // 报错
        // System.out.println("I am a static method" + "name:" + this.name);
        System.out.println("I am a static method");
    }

    // 实例方法定义, 没有static修饰符, 属于对象持有
    // 如果这个方法需要访问实例数据,那么这个方法就不定义成静态方法
    public void print2() {
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
