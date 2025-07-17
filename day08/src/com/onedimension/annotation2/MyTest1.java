package com.onedimension.annotation2;

// 元注解: 注解的注解

// @Target: 表示注解可以用在什么地方 使用ElementType来限定 METHOD表示只能用在方法上
// @Retention: 表示注解的生命周期
// RUNTIME表示保留到运行时(开发常用) CLASS表示到字节码文件阶段(默认) SOURCE表示之作用在源码阶段

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD}) // 只能用在方法和成员变量上
@Retention(RetentionPolicy.RUNTIME) // 表示注解一直保留到运行时
public @interface MyTest1 {
}
