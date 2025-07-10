package com.onedimension.interfaceexercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImplementPrintB implements PrintInterface {
    private Student[] students;

    /**
     * 方案2: 打印学生信息包含男女人数
     */
    @Override
    public void printAllScore() {
        int manNum = 0;
        int womanNum = 0;
        for (Student student : students) {
            System.out.println(student);
            if (student.getSex() == Sex.FEMALE) {
                womanNum++;
            } else {
                manNum++;
            }
        }
        System.out.println("男性人数：" + manNum + "，女性人数：" + womanNum);
    }

    /**
     * 打印平均分 去掉最高分和最低分
     */
    @Override
    public void printAllAvgScore() {
        double totalSource = 0;
        double maxSource = students[0].getSource();
        double minSource = students[0].getSource();
        for (Student student : students) {
            if(student.getSource() > maxSource) {
                maxSource = student.getSource();
            } else if(student.getSource() < minSource) {
                minSource = student.getSource();
            }
            totalSource += student.getSource();
        }
        System.out.println("平均分：" + (totalSource - maxSource - minSource) / (students.length - 2));
    }


}
