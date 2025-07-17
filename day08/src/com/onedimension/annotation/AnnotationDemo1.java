package com.onedimension.annotation;

// 使用注解 本质上是一个实现类对象, 实现了该注解以及annotation接口
@MyBookAnnotation(author = "张三", price = 100)
public class AnnotationDemo1 {
    // 如果注解中只有一个属性, 并且这个属性是value, 使用时可以省略value
    // 或者有其他属性,其他属性必须有默认值, 此时也可以省略
    @MyAnnotation2("默认value")
    public static void main(String[] args) {

    }
}
