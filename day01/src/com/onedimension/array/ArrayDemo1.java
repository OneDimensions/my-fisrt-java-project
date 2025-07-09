package com.onedimension.array;

import java.util.Random;
import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // 定义一个数组 数据类型[] 变量名 = new 数据类型{值1, 值2, 值3, 值4, 值5};
        int[] arr = {1, 2, 3, 4, 5};

        // 定义一个二维数组
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // 定义一个字符串数组
        // String[] students = new String[]{"张三", "李四", "王五", "赵六", "钱七"};
        String[] students = {"张三", "李四", "王五", "赵六", "钱七"};
        randomCall(students);

        recordStudentName();
    }

    /**
     * 随机叫号
     *
     * @param students 列表
     */
    public static void randomCall(String[] students) {
        int length = students.length;
        int index = new Random().nextInt(length);
        String name = students[index];
        System.out.println(name + "请站起来!");
    }

    /**
     * 记录学生信息
     */
    public static void recordStudentName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入录入数量:");
        int studentNum = sc.nextInt();
        String[] students = new String[studentNum];
        for (int i = 0; i < studentNum; i++) {
            System.out.print("请输入学生姓名:");
            String name = sc.next();
            students[i] = name;
        }
        for (int i = 0; i < studentNum; i++) {
            System.out.println(students[i]);
        }
    }
}
