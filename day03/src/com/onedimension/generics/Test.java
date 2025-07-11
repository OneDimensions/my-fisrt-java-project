package com.onedimension.generics;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("张三", 90),
                new Student("李四", 80),
                new Student("王五", 70)
        };

        // 范型测试, 传入学生类型 回传 学生
        Student firstStudent = GenericsDemo2.getFirst(students);
        System.out.println(firstStudent);
    }
}
