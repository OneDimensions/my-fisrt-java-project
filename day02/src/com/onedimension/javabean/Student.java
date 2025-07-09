package com.onedimension.javabean;

/**
 * 实体类的定义
 * 1. 所有成员变量都是私有的
 * 2. 提供公开的getter和setter方法
 * 3. 提供一个无参构造方法
 */

public class Student {
    private String name;
    private int age;
    private String gender;


    // 必须提供无参构造方法
    public Student() {
    }

    // 提供一个有参构造方法(可选)
    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
