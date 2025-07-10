package com.onedimension.abstractdemo;

/**
 * abstract 声明抽象类
 */
public abstract class AbstractDemo1 {
    // 抽象类可以有普通类的属性
    // 抽象不能实例化,只能作为父类被继承

    // 抽象类可以没有抽象方法,但是抽象方法必须得有抽象类
    public abstract void print();

    // 模版方法设计模式 建议使用final修饰 禁止子类重写模版方法
    public final void show() {
        System.out.println("这里是父类里面公用的方法, 继承的子类都可以执行--开始");
        // 直接调用一个子类的抽象方法,来当作一个模版方法,子类重写之后这个方法可以为子类提供独特的功能实现
        // 类似于插槽思想
        print();
        System.out.println("这里是父类里面公用的方法, 继承的子类都可以执行--结束");
    }
}

