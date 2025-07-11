package com.onedimension.collection;

import java.util.*;

public class CollectionDemo1 {
    public static void main(String[] args) {
        // 1. list家族的集合: ArrayList, LinkedList, Vector
        // 特点: 存储有序的元素，可重复,有索引
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("hello");
        list.add("w");
        System.out.println(list.get(0));
        System.out.println(list);

        // 2. set家的集合: HashSet, TreeSet, LinkedHashSet
        // 特点: 存储无序的元素，不可重复,无索引
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("hello");
        set.add("w");
        System.out.println(set);

        // 集合转数组
        String[] arr = list.toArray(String[]::new);
        System.out.println(Arrays.toString(arr));

        System.out.println("=====循环======");
        System.out.println("===========迭代器============");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println("===========增强for循环============");
        // for (元素类型 变量名 : 数组或集合)
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("===========lambda表达式============");
        list.forEach(s -> System.out.println(s));
    }
}
