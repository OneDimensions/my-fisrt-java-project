package com.onedimension.loop;

public class LoopDemo1 {
    public static void main(String[] args) {
        main1();
    }

    // 循环嵌套
    public static void main1() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
