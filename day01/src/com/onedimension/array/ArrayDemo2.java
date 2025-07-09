package com.onedimension.array;

import java.util.Random;

public class ArrayDemo2 {
    public static void main(String[] args) {
        randomStudents();
    }

    public static void randomStudents() {
        String[][] students = {
                {"张三", "李四", "王五", "理想"},
                {"赵六", "钱七", "孙八"},
                {"周九", "吴十"}
        };

        for (int i = 0; i < students.length; i++) {
            String[] studentRow = students[i];
            for (int j = 0; j < studentRow.length; j++) {
                // 随机获取列下标
                int n = new Random().nextInt(students.length);
                // 随机获取行下标
                int m = new Random().nextInt(students[n].length);

                String temp = students[n][m];
                students[n][m] = students[i][j];
                students[i][j] = temp;
            }
        }

        System.out.println("随机结果:");
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                System.out.print(students[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
