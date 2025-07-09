package com.onedimension.polymorphic;

public class Cat extends Animal {
    String name = "猫";

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void eatFish() {
        System.out.println("猫吃鱼--");
    }

    // 爬树 子类独有
    public void climb() {
        System.out.println("猫爬树");
    }
}
