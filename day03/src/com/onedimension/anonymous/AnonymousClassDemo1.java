package com.onedimension.anonymous;

public class AnonymousClassDemo1 {

    public static void main(String[] args) {

        // 创建一个匿名内部类, 本质上是一个子类, 会立即创建出一个子类对象
        // 更为方便的创建匿名子类
        // 等同于下面class Cat extends Animal的代码
        Animal cat = new Animal() {
            @Override
            public void run() {
                System.out.println("猫在跑");
            }
        };

        // 匿名内部类的使用
        // 通常作为参数传递给方法,在方法内部调用
        startSwim(new Swim() {
            @Override
            public void swiming() {
                System.out.println("猫在游泳");
            }
        });

        // 简化写法
        startSwim(() -> System.out.println("猫在游泳"));
    }

    public static void startSwim(Swim s) {
        // 对象回调
        s.swiming();
    }
}

interface Swim {

    void swiming();
}


class Cat extends Animal {
    @Override
    public void run() {
        System.out.println("猫在跑");
    }
}