package com.onedimension.annotation2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationDemo3MyJunit {


    public static void main(String[] args) {
        System.out.println("main方法执行了");
    }

    // 被MyJunit注解的测试方法一定是 public 无参无返回值
    @MyJunit(runCount = 3)
    public void run() {
        System.out.println("run方法执行了");
    }

    @MyJunit
    public void go() {
        System.out.println("go方法执行了");
    }

    public void stop() {
        System.out.println("stop方法执行了");
    }
}
