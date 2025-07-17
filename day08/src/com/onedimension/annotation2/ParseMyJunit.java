package com.onedimension.annotation2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ParseMyJunit {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        parseMethod();
    }

    public static void parseMethod() throws InvocationTargetException, IllegalAccessException {
        // 拿到类
        Class myclass = AnnotationDemo3MyJunit.class;
        // 拿到类所有的方法
        Method[] methods = myclass.getDeclaredMethods();
        // 遍历类
        for (Method method : methods) {
            // 判断该方法上是否有MyJunit注解 如果有该注解就调用
            if (method.isAnnotationPresent(MyJunit.class)) {

                // 获取方法上的myJunit注解
                MyJunit myJunit = method.getDeclaredAnnotation(MyJunit.class);

                // 获取myJunit注解上的runCount值
                int runCount = myJunit.runCount();
                // 根据注解的runCount值进行循环调用
                for (int i = 0; i < runCount; i++) {
                    // 被MyJunit注解的测试方法一定是 public 无参无返回值
                    method.invoke(new AnnotationDemo3MyJunit());
                }
            }
        }
    }
}