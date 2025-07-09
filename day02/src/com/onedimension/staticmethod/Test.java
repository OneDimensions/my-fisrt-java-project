package com.onedimension.staticmethod;

public class Test {
    public static void main(String[] args) {
        // 调用静态方法
        // 规范: 如果这个方法只是为了做一个功能且不需要直接访问对象的数据,就定义成静态方法
        Student.print();

        Student s = new Student("lisi");
        // 如果这个方法需要访问实例数据,那么这个方法就不定义成静态方法
        // 实例方法只能通过实例化的对象访问
        s.print2();
    }
}
