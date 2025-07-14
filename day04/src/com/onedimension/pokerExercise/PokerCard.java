package com.onedimension.pokerExercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PokerCard implements Comparable<PokerCard> {
    private String size;
    private String color;
    // 排序方式二: 直接写权重
    // 权重
    private int weight;

    @Override
    public String toString() {
        return size + color;
    }


    // 排序 方式一
    // 重写compareTo方法, 使用Collections.sort来调用,实现自定义排序
    @Override
    public int compareTo(PokerCard p) {
        // 方式一: 用数组下标
        //        String[] size = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "LITTLE_JOKER", "BIG_JOKER"};
        //        String[] colors = {"♦", "♣", "♥", "♠",};
        //        // 获取当前牌型在size数组中的索引
        //        int thisSizeIndex = Arrays.asList(size).indexOf(this.size);
        //        int thisColorIndex = Arrays.asList(colors).indexOf(this.color);
        //        int pSizeIndex = Arrays.asList(size).indexOf(p.size);
        //        int pColorIndex = Arrays.asList(colors).indexOf(p.color);
        // 如果传入的牌(后一张)比当前牌(前一张)大,则返回1,调换位置,实现大到小排序
        //        if (pSizeIndex > thisSizeIndex) {
        //            return 1;
        //        } else if (pSizeIndex == thisSizeIndex) {
        //            // 如果牌型相同,则比较牌颜色
        //            return  pColorIndex - thisColorIndex;
        //        } else {
        //            // 如果传入的牌比当前牌小,则返回-1,不进行位置调换
        //            return -1;
        //        }

        // 方式二: 使用事先定义好的权重权重
        return p.weight - weight;
    }
}
