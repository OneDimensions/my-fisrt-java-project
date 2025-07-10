package com.onedimension.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

public class LambdaDemo1 {

    public static void main(String[] args) {

        // 只有函数式接口的匿名内部类才可以使用lambda
        FunctionInterface f1 = () -> System.out.println("lambda函数");
        f1.run();


        Student student1 = new Student("张三", 24, 90.1);
        Student student2 = new Student("李四", 23, 89.1);
        Student student3 = new Student("王五", 70, 100.1);

        Student[] students = new Student[]{student1, student2, student3};
        Student[] students2 = new Student[]{student1, student2, student3};

        // 按照年龄进行排序
        // 简化1 : Arrays.sort(students, (s1, s2) -> (s1.getAge() - s2.getAge()));
        // 如果lambda表达式只是调用一个静态方法, 并且前后参数列表一样, 可以使用静态方法引用  格式: 类名::方法名
        Arrays.sort(students, Student::compareByAge);

        // 成员方法引用
        Arrays.sort(students2, student1::compareByScore);

        // 年龄排序
        for (Student student : students) {
            System.out.println(student);
        }
        // 成绩排序
        for (Student student : students2) {
            System.out.println(student);
        }

        String[] names = {"jack", "tom", "Jerry", "lucy", "Lily"};
        // 按照首字母忽略大小写进行排序

        // 如果lambda表达式只是调用一个特定类型的实例方法, 并且是由第一个参数调用,第二个参数作为方法的参数, 可以使用特定类型方法引用
        // Arrays.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));
        // compareToIgnoreCase: 比较字符串忽略大小写
        // 所以上述代码可以简化为
        // 格式: 特定类的名称::方法名
        Arrays.sort(names, String::compareToIgnoreCase);
        for (String name : names) {
            System.out.println(name);
        }

        // 构造器引用
        // 格式: 类名::new
        CarFactory car = Car::new;
        Car car1 = car.getCar("宝马");
        System.out.println(car1);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    static class Car {
        private String name;
    }

    interface CarFactory {
        Car getCar(String name);
    }
}
