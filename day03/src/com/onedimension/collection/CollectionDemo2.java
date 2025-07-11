package com.onedimension.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo2 {

    public static void main(String[] args) {
        // 处理迭代并发修改问题
        // Collection 没有索引,不能调用get 方法
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("javaScript");
        list.add("hello");

        // for
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.contains("o")) {
                // 删除时下标返回上一个解决遍历跳过的问题
                // 或者倒着遍历
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

        // 迭代器
        List<String> list2= new ArrayList<>();
        list2.add("hello");
        list2.add("world");
        list2.add("java");
        list2.add("javaScript");
        list2.add("hello");
        Iterator<String> iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            String s = iterator2.next();
            if (s.contains("o")) {
                // 使用迭代器的remove方法删除
                iterator2.remove();
            }
        }
        System.out.println(list2);
    }
}
