package com.onedimension.array;

import java.util.Random;

public class ArrayPokerDemo {
    public static void main(String[] args) {
        String[] poker = start();
        System.out.println("创建一副扑克:");
        for (String p : poker) {
            System.out.print(p + "\t");
        }
        System.out.println();
        String[] radomPoker = randomPoker(poker);
        System.out.println("洗牌后的结果:");
        for (String p : radomPoker) {
            System.out.print(p + "\t");
        }
    }

    /**
     * 创建一副扑克
     *
     * @return poker
     */
    public static String[] start() {
        // 一副扑克共52张
        String[] poker = new String[54];
        // 创建一副扑克
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        // 花色
        String[] colors = {"♠", "♣", "♦", "♥"};

        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            // 4个花色 增强型for 类型 变量 : 集合
            for (String color : colors) {
                poker[index++] = color + numbers[i];
            }
        }
        poker[index++] = "小王";
        poker[index] = "大王";
        return poker;
    }

    /**
     * 洗牌
     * @param poker 扑克
     * @return poker 洗牌之后的扑克
     */
    public static String[] randomPoker(String[] poker) {
        for (int i = 0; i < poker.length; i++) {
            // 创建一个随机下标
            int index = new Random().nextInt(poker.length);
            // 让当前元素和随机下标的元素交换
            String temp = poker[i];
            poker[i] = poker[index];
            poker[index] = temp;
        }
        return poker;
    }
}
