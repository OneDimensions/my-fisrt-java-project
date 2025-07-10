package com.onedimension.singleinstance;

public class Test {
    public static void main(String[] args) {
        SingleDemo1 s1 = SingleDemo1.getInstance();
        SingleDemo1 s2 = SingleDemo1.getInstance();
        System.out.println(s1 == s2);

        SingleDemo2 s3 = SingleDemo2.getInstance();
        SingleDemo2 s4 = SingleDemo2.getInstance();
        System.out.println(s3 == s4);
    }
}
