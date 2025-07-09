package com.onedimension.constructor;

public class Test {
    public static void main(String[] args) {
        // 创建对象时, 对象就会调用构造方法
        Student student1 = new Student();
        Student student2 = new Student("小明", 19);
        student2.setGender("男");
        System.out.println(student2.name + student2.age + student2.getGender());
    }
}
