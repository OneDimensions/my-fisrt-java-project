package com.onedimension.packageclass;

import java.util.ArrayList;

public class PackageClassDemo1 {

    // 范型擦除, 范型在编译之后都会被擦除,恢复成object, 所以范型只支持引用数据类型
    public static void main(String[] args) {


        // 包装类: 把基本数据类型转换成对应的引用数据类型 Integer Double Float Long Boolean Character Byte Short
        // 手工装箱 把基本数据类型转换成对应的包装类对象
        // Integer i = new Integer(1); // 过时
        Integer i1 = Integer.valueOf(1);
        Integer i2 = Integer.valueOf(1);
        // 两个对象相等
        System.out.println(i1 == i2);

        // 自动拆箱: 把包装类对象转换成对应的基本数据类型
        int j = i1;
        System.out.println(j);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // 自动装箱
        int i3 = list.get(0); // 自动拆箱
        System.out.println(i3);

        // 包装类的增加功能
        String s1 = i1.toString();

        String s2 = "99";
        // 将字符串转为整数
        int i4 = Integer.parseInt(s2);
        // 或者 推荐
        Integer i5 = Integer.valueOf(s2);
        System.out.println(i4 + j);
    }
}
