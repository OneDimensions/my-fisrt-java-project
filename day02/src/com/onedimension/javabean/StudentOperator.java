package com.onedimension.javabean;

public class StudentOperator {

    private final Student student;

    public StudentOperator(Student student) {
        this.student = student;
    }

    // 实体类数据的业务逻辑处理
    public void printStudent() {
        System.out.println("姓名：" + this.student.getName());
        System.out.println("年龄：" + this.student.getAge());
        System.out.println("性别：" + this.student.getGender());
    }
}
