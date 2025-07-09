package com.onedimension.javabean;

public class Test {
    public static void main(String[] args) {
        // 实体类的基本作用: 封装数据
        // 只做数据的存取, 不做业务逻辑处理
        Student student = new Student("张三", 18, "男");
        StudentOperator so = new StudentOperator(student);
        so.printStudent();
    }
}
