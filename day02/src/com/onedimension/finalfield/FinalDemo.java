package com.onedimension.finalfield;

// 被final修饰的类不能被继承
public final class FinalDemo {
    // 修饰成员变量 final + static 修饰的静态变量成为常量
    final static String SCHOOL_NAME = "xx大学";

    public static void main(String[] args) {
        // 被final修饰过的变量地址不可再修改, 但如果是引用数据类型, 则对象内容可修改
        // final只能赋值一次, 不能再次赋值, 所以初始化需要赋值
        final int a = 10;
        // 报错 被final修饰的局部变量不能被修改
        // a = 12;
        final int[] arr = {a, 2, 3, 4, 5};
        arr[0] = 10;

        System.out.println(arr);
    }

    // 被final修饰的方法不能被重写
    public final void print() {
        System.out.println("print");
    }
}
