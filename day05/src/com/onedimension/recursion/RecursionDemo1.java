package com.onedimension.recursion;

public class RecursionDemo1 {
    public static void main(String[] args) {
        System.out.println(recursion(1));
    }

    /**
     * 猴子吃桃问题
     * 第一天摘了若干个桃子
     * 吃了一半多一个,
     * 之后每天都一样
     * 第十天剩一个
     * 求第一天摘了多少
     * 后一天的桃子 = 桃子总数 - 前一天的桃子 / 2 - 1
     * f(n + 1) = f(n) - f(n) / 2 - 1
     * 2f(n + 1) = 2f(n) - f(n) - 2
     * 2f(n + 1) = f(n) - 2
     * f(n) = 2f(n + 1) + 2
     */

    public static int recursion(int day) {
        if (day == 10) return 1;
        return 2 * recursion(day + 1) + 2;
    }
}
