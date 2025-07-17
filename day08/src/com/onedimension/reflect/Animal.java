package com.onedimension.reflect;

public class Animal {
    private String name;
    private int age;

    private Animal() {
    }

    private Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void eat() {
        System.out.println("私有方法");
    }

    private String eat(String s) {
        return "私有方法" + s;
    }

    public void show() {
        System.out.println("name:" + name + " age:" + age);
    }
}
