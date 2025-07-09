package com.onedimension.polymorphic;

public class Dog extends  Animal {
    String name = "狗";

    // 重写父类的返回 实现多态
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
