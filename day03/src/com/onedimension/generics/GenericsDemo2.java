package com.onedimension.generics;

public class GenericsDemo2 {

    public static <T> void printMax(T[] names) {
        System.out.println(getFirst(names));
    }

    // 定义一个泛型方法
    public static <T> T getFirst(T[] names) {
        return names[0];
    }
}
