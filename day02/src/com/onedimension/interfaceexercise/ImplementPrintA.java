package com.onedimension.interfaceexercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImplementPrintA implements PrintInterface {
    private Student[] students;

    /**
     * 方案一: 打印全部学生成绩
     */
    @Override
    public void printAllScore() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    /**
     * 方案一: 打印全部平均分
     */
    @Override
    public void printAllAvgScore() {
        double totalSource = 0;
        for (Student student : students) {
            totalSource += student.getSource();
        }
        System.out.println("平均分：" + totalSource / students.length);
    }

}
