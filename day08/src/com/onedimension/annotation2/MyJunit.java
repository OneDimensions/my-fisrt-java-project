package com.onedimension.annotation2;

// 只要是加了这个注解的类, 就会执行

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // 只能用在方法上
@Retention(RetentionPolicy.RUNTIME) // 表示注解一直保留到运行时
// 被MyJunit注解的测试方法一定是 public 无参无返回值
public @interface MyJunit {
    // 运行次数
    int runCount() default 1;
}
