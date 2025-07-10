package com.onedimension.interfaceexercise;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("张三", Sex.MALE, 90.5);
        Student student2 = new Student("李四", Sex.FEMALE, 80.5);
        Student student3 = new Student("王五", Sex.MALE, 70.5);
        Class1 class1 = new Class1(new Student[]{student1, student2, student3});
        PrintInterface printInterface = new ImplementPrintA(class1.getStudents());
        // 接口的好处。切换方案
        // PrintInterface printInterface = new ImplementPrintB(class1.getStudents());

        printInterface.printAllScore();
        printInterface.printAllAvgScore();
    }
}
