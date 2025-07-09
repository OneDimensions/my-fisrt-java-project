package com.onedimension.staticfield;

public class User {
    // 静态变量应用, 记录用户类被创建了多少次
    public static int count = 0;

    private String name;

    // 在构造方法中增加count
    public User(String name) {
        // 同一个类中访问静态变量可以省略类名
        count++;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
