package com.onedimension.innerclass;

public class Test {
    public static void main(String[] args) {
        // 实例化一个内部类,需要先实例化外部类
        OuterClass.InnerClass oi = new OuterClass().new InnerClass();
        oi.run();
        OuterClass os = new OuterClass();

        // 静态内部类
        OuterClass.StaticInnerClass ois = new OuterClass.StaticInnerClass();
        ois.run();
    }
}
