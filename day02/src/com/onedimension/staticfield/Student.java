package com.onedimension.staticfield;

public class Student {

    // static 静态变量: 属于类, 只加载一份, 可以被类和类的全部对象所访问
    // 静态变量的内存地址只有一份, 所有对象访问的都是同一份内存空间
    // 静态变量的应用场景: 如果是数据只需要一份, 且希望能被共享和修改
    static String name;
    // 实例变量: 属于对象, 每一个对象都拥有一份
    // 实例变量在类进行实例化时会为每个实例对象分配内存空间
    int age;
}
