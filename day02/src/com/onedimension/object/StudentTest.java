package com.onedimension.object;

public class StudentTest {
    public static void main(String[] args) {
        // 创建对象格式 类名 对象名 = new 类名();
        Student student1 = new Student();
        student1.name = "小明";
        student1.age = 18;
        student1.gender = "男";
        student1.chinese = 80;
        student1.math = 90;
        student1.english = 50;
        student1.printAllScore();
    }
}
