package com.onedimension.annotation2;

@MyTest2(value = "张三", address = {"北京", "上海"})
public class AnnotationDemo2 {

    @MyTest2(value = "李四", address = {"广州", "深圳"})
    public void run() {

    }
}
