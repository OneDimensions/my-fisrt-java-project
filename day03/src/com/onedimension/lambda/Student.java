package com.onedimension.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private int age;
    private double score;

    // 定义排序的静态方法,供lambda表达式调用
    public static int compareByAge(Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }

    // 对象实例方法
    public int compareByScore(Student s1, Student s2) {
        // Double.compare 可以比较两个double大小
        return Double.compare(s1.getScore(), s2.getScore());
    }
}
