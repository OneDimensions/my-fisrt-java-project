package com.onedimension.staticfield;

public class Test {
    public static void main(String[] args) {
        // 访问类中的静态字段
        // 静态字段全员共享一份, 如果下面重新对name赋值,这里的赋值会被覆盖
        Student.name = "黎明";

        // 不推荐通过对象访问静态字段
        Student s1 = new Student();
        s1.name = "哈哈哈";
        System.out.println(Student.name);
        System.out.println(s1.name);

        User u1 = new User("张三");
        User u2 = new User("李四");
        System.out.println("user创建次数:" + User.count);
    }
}
