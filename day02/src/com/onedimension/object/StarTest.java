package com.onedimension.object;

public class StarTest {
    public static void main(String[] args) {
        // 创建对象格式 类名 对象名 = new 类名();
        Star star1 = new Star();
        star1.name = "小明";
        star1.age = 18;
        star1.gender = "男";
        star1.weight = 50.0;
        star1.height = 1.75;
        System.out.println(star1.name);
        System.out.println(star1.age);
        System.out.println(star1.gender);
        System.out.println(star1.weight);

        Star star2 = new Star();
        star2.name = "小红";
        star2.age = 19;
        star2.gender = "女";
        star2.weight = 50.0;
        star2.height = 1.75;
        System.out.println(star2.name);
        System.out.println(star2.age);
        System.out.println(star2.gender);
        System.out.println(star2.weight);
    }
}
