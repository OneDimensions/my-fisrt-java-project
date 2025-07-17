package com.onedimension.annotation;

public @interface MyAnnotation2 {
    // 如果注解中只有一个属性, 并且这个属性是value, 使用时可以省略value
    String value();
    // 或者有其他属性,其他属性必须有默认值, 此时也可以省略
    String name() default "无名";
}
