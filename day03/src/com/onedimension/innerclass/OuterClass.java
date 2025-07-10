package com.onedimension.innerclass;

public class OuterClass {
    private static final String schoolName = "哈哈";
    private String familyName;
    public int age;

    public void go() {
        System.out.println("go");
    }

    // 内部类 无static修饰  属于外部类实例化的对象持有
    // 拥有一个正常类的特性
    public class InnerClass {
        private String name;

        public void run() {
            // 访问外部类的静态
            System.out.println(schoolName);
            // 访问外部类的私有成员变量
            System.out.println(familyName);
            // 访问外部类的实例成员变量
            System.out.println(age);
            // 访问外部类的成员方法
            go();
            // 访问自身this
            System.out.println(this);
            // 访问的是外部类的this
            System.out.println(OuterClass.this);
        }
    }

    // 静态内部类 不属于外部类实例化的对象持有
    public static class StaticInnerClass {

        public void run() {
            System.out.println("静态内部类");
            // 不能访问外部类的实例成员变量
            // System.out.println(familyName);
        }
    }

}
