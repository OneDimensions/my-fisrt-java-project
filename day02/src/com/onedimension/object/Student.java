package com.onedimension.object;

public class Student {
    String name;
    int age;
    String gender;
    double chinese;
    double math;
    double english;

    public void printAllScore() {
        System.out.println("学生姓名:" + name
                + "学生年龄:" + age
                + "学生性别:" + gender
                + "语文成绩:" + chinese
                + "数学成绩:" + math
                + "英语成绩:" + english);
    }
}
