package com.onedimension.extend;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setSkill("java");
        t.setName("张三");
        System.out.println(t.getName());
        System.out.println(t.getSkill());
    }
}
