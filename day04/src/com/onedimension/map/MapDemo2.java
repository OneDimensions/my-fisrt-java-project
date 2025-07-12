package com.onedimension.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Teacher> teacherMap = new HashMap<>();
        // 添加数据
        teacherMap.put("005", new Teacher("张三", 10000, "java"));
        teacherMap.put("006", new Teacher("李四", 20000, "python"));
        teacherMap.put("007", new Teacher("王五", 30000, "c++"));
        teacherMap.put("008", new Teacher("赵六", 40000, "php"));

        System.out.println(teacherMap);

        System.out.println("=====keySet遍历======");
        // for遍历
        // 1. 获取所有的key
        // 2. 根据key获取value
        for (String key : teacherMap.keySet()) {
            System.out.println(key + ":" + teacherMap.get(key));
        }
        System.out.println("=====entrySet遍历======");
        // entrySet遍历
        // 将map中的数据封装成entry 是一个set集合
        Set<Map.Entry<String, Teacher>> entrySet = teacherMap.entrySet();
        // 遍历set取出每个entry
        for (Map.Entry<String, Teacher> entry : entrySet) {
            // entry中有getKey 和 getValue等方法
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println("=====lambda遍历======");
        // lambda遍历 forEach内部实际上是使用上面的entrySet遍历之后将key value调用accept方法回传出来
        teacherMap.forEach((k , v) -> System.out.println(k + ":" + v));
    }
}
