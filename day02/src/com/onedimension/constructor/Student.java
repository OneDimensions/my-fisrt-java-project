package com.onedimension.constructor;

public class Student {
    String name;
    int age;
    // private 私有 修饰成员变量 只能在本类中访问 外部无法访问
    private String gender;

    // 无参数构造方法
    // 构造器:是一种特殊的方法,不能有返回值, 方法名和类名一致
    // 类默认带一个无参构造, 但是如果自定义了构造方法, 如果还需要无参构造, 需要重新定义
    public Student() {
        System.out.println("无参数构造方法");
    }

    // 构造器重载 有参数构造器
    public Student(String name, int age) {
        System.out.println("有参数构造方法");
        // this 代表当前对象, 主要解决命名冲突, 区分本地变量和成员变量
        this.name = name;
        this.age = age;
    }

    // 对私有属性暴露get 和 set 供外部访问
    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        if(gender.equals("男") || gender.equals("女")) {
            this.gender = gender;
        } else {
            System.out.println("性别错误");
        }
    }
}
