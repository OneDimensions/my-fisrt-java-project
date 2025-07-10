package com.onedimension.abstractdemo;

public class AbstractChild1 extends AbstractDemo1 {

    // 子类继承父抽象类 必须重新完所有的父类抽象方法, 否则子类也需要声明为抽象类
    @Override
    public void print() {
        System.out.println("AbstractChild1子类独有逻辑片段");
    }
}
