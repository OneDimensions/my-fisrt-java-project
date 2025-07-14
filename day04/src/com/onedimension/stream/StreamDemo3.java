package com.onedimension.stream;

import com.onedimension.set.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {

        // stream收集操作(终结方法)

        List<String> list1 = new ArrayList<>();
        list1.add("张三");
        list1.add("张三");
        list1.add("张三");

        // forEach
        list1.stream().forEach(System.out::println);

        // count max min
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(6);
        // stream的max是放到一个Optional对象中
        Optional<Integer> max = list2.stream().max(Integer::compareTo);
        System.out.println(max.get());

        // 收集到集合或者数据中去 流只能收集一次
        // toList到list toArray到数组 toSet到集合
        List<String> list3 = list1.stream().toList();


        List<Student> s1 = new ArrayList<>();
        s1.add(new Student("张三", 90));
        s1.add(new Student("李四", 75));
        s1.add(new Student("王五", 80));

        // 收集到map集合 // 键为姓名，值为成绩 // toMap(function keymap, valueMap)
        Map<String, Double> m1 = s1.stream().collect(Collectors.toMap(Student::getName, Student::getSource));
        System.out.println(m1);
    }
}
