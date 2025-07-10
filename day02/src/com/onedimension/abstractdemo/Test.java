package com.onedimension.abstractdemo;

public class Test {
    public static void main(String[] args) {
        AbstractDemo1 ad1 = new AbstractChild1();
        ad1.show();
        AbstractChild2 ac2 = new AbstractChild2();
        ac2.show();
    }
}
