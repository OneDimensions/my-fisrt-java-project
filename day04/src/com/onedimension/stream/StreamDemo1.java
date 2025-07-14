package com.onedimension.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("张三丰");
        list.add("张无忌");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("张三");

        // 将list中以张开头，长度为3的元素放入新的list中
        List<String> zhangList = list.stream()
                .filter(e -> e.startsWith("张") && e.length() == 3)
                // 收集到集合
                .collect(Collectors.toList());
                // 或者 .toList()
        System.out.println(zhangList);


    }
}
