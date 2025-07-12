package com.onedimension.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {

        // 创建hashmap集合
        // 无序 键无重复 无索引
        // 键值对都可以是null 值不做要求
        Map<String, Teacher> teacherMap = new HashMap<>();

        // 添加数据
        teacherMap.put("001", new Teacher("张三", 10000, "java"));
        teacherMap.put("002", new Teacher("李四", 20000, "python"));
        teacherMap.put("003", new Teacher("王五", 30000, "c++"));
        teacherMap.put("004", new Teacher("赵六", 40000, "php"));

        // 重复的key会覆盖, 如果已存在的话会返回覆盖前的值
        Teacher t2 = teacherMap.put("002", new Teacher("李四", 20000, "javaScript"));
        System.out.println("t2:" + t2);

        System.out.println(teacherMap);

        // 获取元素
        System.out.println("获取元素:" + teacherMap.get("001"));
        // 删除元素
        System.out.println("删除元素:" + teacherMap.remove("001"));
        // 获取元素个数
        System.out.println("获取元素个数:" + teacherMap.size());
        // 判断是否为空
        System.out.println("判断是否为空:" + teacherMap.isEmpty());
        // 判断是否包含某个元素
        System.out.println("判断是否包含某个元素:" + teacherMap.containsKey("001"));
        // 判断是否包含某个值
        System.out.println("判断是否包含某个值:" + teacherMap.containsValue(teacherMap.get("002")));
        // 获取所有的key 这是一个String类型的set集合
        System.out.println("获取所有的key:" + teacherMap.keySet());
        // 获取所有的value 这是一个Teacher类型的collection 因为值有可能重复
        System.out.println("获取所有的value:" + teacherMap.values());
        // 清空
        teacherMap.clear();

    }
}
