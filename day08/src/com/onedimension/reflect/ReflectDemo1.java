package com.onedimension.reflect;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 反射的第一步操作 获取Class对象(类本身)

        // 方式1 类.class
        Class c1 = Student.class;
        System.out.println(c1);

        // 方式二 class.forName("全类名")
        Class c2 = Class.forName("com.onedimension.reflect.Student");
        System.out.println(c2);

        // 方式三 对象.getClass()
        Student s = new Student();
        Class c3 = s.getClass();
        System.out.println(c3);

        System.out.println(c1 == c2);
        System.out.println(c2 == c3);

    }
}
