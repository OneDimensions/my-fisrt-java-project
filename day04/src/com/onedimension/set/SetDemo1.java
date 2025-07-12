package com.onedimension.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        // 创建一个set集合
        // HashSet 无序，不可重复，无索引
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("javaScript");
        set.add("java");
        System.out.println(set);

        // linkHashSet 有序，不可重复，无索引
        // TreeSet 默认按小到大排序，不可重复，有索引


        // Hashset去重操作
        // 如果希望Set集合认为两个内容是同一个对象,需要重写对象的equals和hashCode方法
        Student s1 = new Student("张三", 12.1);
        Student s2 = new Student("李四", 23.1);
        Student s3 = new Student("张三", 3.1);
        Student s4 = new Student("李四", 12.0);

        Set<Student> set1 = new HashSet<>();
        set1.add(s1);
        set1.add(s2);
        set1.add(s3);
        set1.add(s4);
        System.out.println(set1);

        // TreeSet排序操作
        // TrssSet默认不能给自定对象排序,需要重写对象的compareTo方法
        Student s5 = new Student("张三", 12.1);
        Student s6 = new Student("李四", 23.1);
        Student s8 = new Student("王五", 3.1);
        Student s9 = new Student("赵六", 3.1);
        // 也可以使用匿名对象
        // 如果集合指定了排序方法, 优先使用指定的排序方法
        Set<Student> set2 = new TreeSet<>((o1, o2) -> Double.compare(o2.getSource(), o1.getSource()));
        set2.add(s5);
        set2.add(s6);
        set2.add(s8);
        set2.add(s9);
        System.out.println(set2);
    }
}
