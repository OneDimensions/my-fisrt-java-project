package com.onedimension.annotation;

// 自定义注解
// 1. 创建注解 @Retention(RetentionPolicy.RUNTIME)
// 注解本质上是一个继承了Annotation接口的接口 里面定义了抽象方法
public @interface MyBookAnnotation {
    // 2. 添加注解的属性
    String author() default "无名";
    int price() default 0;
}
