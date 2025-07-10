package com.onedimension.codeblock;

public class CodeBlockDemo1 {
    private static final String name;
    public int age;

    // 实例(构造)代码块
    // 在类的构造方法之后执行, 需要创建对象才会执行
    // 每次创建对象都会执行一次
    {
        System.out.println("实例代码块");
        // 可以用于初始化"实例"变量
        age = 18;
    }

    // 静态代码块
    // 类加载时自动执行, 在类的构造方法之前执行,
    // 只会执行一次
    static {
        System.out.println("静态代码块");
        // 常用于初始化"静态"变量
        name = "张三";
    }

    public static void main(String[] args) {
        System.out.println("main方法");
        CodeBlockDemo1 codeBlockDemo1 = new CodeBlockDemo1();
        CodeBlockDemo1 codeBlockDemo1_1 = new CodeBlockDemo1();
    }

}
