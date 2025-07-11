package com.onedimension.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("w");
        list.add("h");
        list.add("e");
        list.add("!");
        // 获取指定位置元素
        System.out.println(list.get(1));
        // 获取元素个数
        System.out.println(list.size());
        // 判断是否为空
        System.out.println(list.isEmpty());
        // 判断是否包含某个元素
        System.out.println(list.contains("world"));

        // 删除元素
        System.out.println(list.remove("world"));
        System.out.println(list.remove(1));

        // 修改元素
        list.set(0, "hello world");


        System.out.println(Arrays.toString(list.toArray()));

        System.out.println("==forEach遍历===");
        list.forEach(System.out::println);



        System.out.println("===for遍历===");
        // 遍历
        for (String s : list) {
            System.out.println(s);
        }

    }

}
