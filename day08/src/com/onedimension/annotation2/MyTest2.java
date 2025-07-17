package com.onedimension.annotation2;

// 注解的解析

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE}) // 注解类和方法
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest2 {
    String value();
    String[] address();
}
