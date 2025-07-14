package com.onedimension.stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        // 获取stream流的方式
        List<String> list1 = new ArrayList<>();

        // 1. 调用stream方法
        Stream<String> stream1 = list1.stream();

        // map集合获取方式
        Map<String, String> map1 = new HashMap<>();
        // 获取键流
        Stream<String> stream2 = map1.keySet().stream();
        // 获取值流
        Stream<String> stream3 = map1.values().stream();

        // 获取数组的流
        String[] arr = {"张三", "李四", "王五"};
        Stream<String> stream4 = Arrays.stream(arr);
        System.out.println(stream4.count());
        Stream<String> stream5 = Stream.of(arr);

        // stream流常用中间方法
        // filter 过滤
        // sorted 排序
        // limit 截取前n个元素
        // skip 跳过前n个元素
        // distinct 去重
        // map 对元素加工
        // concat 合并两个流
        Stream<String> stream6 = Stream.concat(stream1, stream2);
    }
}
