package com.onedimension.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // 模拟80次投票
        for (int i = 0; i < 80; i++) {
            int random = (int) (Math.random() * 4);
            // 随机获取A B C D
            String key = Arrays.asList("A", "B", "C", "D").get(random);
            // 为获取的key对应的value + 1 投票
            map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
        }

        int max = 0;
        String key = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value > max) {
                max = value;
                key = entry.getKey();
            }
        }
        System.out.println("统计结果为:" + map);
        System.out.println("最多得票的是:" + key);
    }
}
