package com.onedimension.override;

public class Test {
    public static void main(String[] args) {
        // 创建对象, 调用方法
        Student student = new Student("小明", 19);

        // 默认调用父类的toString
        // 这里调用的是子类重写的方法
        System.out.println(student);
    }
}
