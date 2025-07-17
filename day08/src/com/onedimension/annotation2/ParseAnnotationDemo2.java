package com.onedimension.annotation2;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

// 解析注解
public class ParseAnnotationDemo2 {

    // 解析类
    @Test
    public void parseClass() {
        // 1. 获取类的Class对象
        Class c1 = AnnotationDemo2.class;

        // 2. 判断类上是否陈列了注解
        if (c1.isAnnotationPresent(MyTest2.class)) {

            // 3. 使用getDeclaredAnnotation获取类上的注解  参数为注解的类型
            MyTest2 myTest2 = (MyTest2) c1.getDeclaredAnnotation(MyTest2.class);

            // 4. 获取注解的属性值
            String value = myTest2.value();
            String[] address = myTest2.address();

            // 5. 打印
            System.out.println(value);
            System.out.println(Arrays.toString(address));


        }

    }

    // 解析方法
    @Test
    public void parseMethod() throws NoSuchMethodException {

        // 1. 获取类的Class对象
        Class c1 = AnnotationDemo2.class;

        // 2. 获取类上的指定的方法
        Method method = c1.getDeclaredMethod("run");

        // 2. 判断类上是否陈列了注解
        if(method.isAnnotationPresent(MyTest2.class)){

            // 3. 获取方法上的注解
            MyTest2 myTest2 = method.getDeclaredAnnotation(MyTest2.class);

            // 4. 获取注解的属性值
            String value = myTest2.value();
            String[] address = myTest2.address();

            // 5. 打印
            System.out.println(value);
            System.out.println(Arrays.toString(address));
        }

    }
}
