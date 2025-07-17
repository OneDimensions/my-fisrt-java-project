package com.onedimension.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        // 反射的作用
        // 1. 获取类的属性和方法
        // 2. 绕过访问权限修饰符 破坏封装性
        // 3. 绕过范型约束

        // 核心作用: 基于反射设计一些通用功能

        List<String> list = new ArrayList<>();

        list.add("hello");


        // 破坏范型约束
        Class lc = list.getClass();
        Method add = lc.getMethod("add", Object.class);
        add.invoke(list, 100); // 添加任意对象
        add.invoke(list, true);
        System.out.println(list);
    }
}
