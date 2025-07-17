package com.onedimension.api;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        Double d1 = 0.1;
        Double d2 = 0.2;
        System.out.println(d1 + d2); // 0.30000000000000004

        // 使用big decimal解决小数运算
        // 把小数包装成big decimal对象
        // BigDecimal b1 = new BigDecimal(0.1); // 直接用double创建对象会丢失精度 不推荐

        // 必须把数字转为字符串才能解决精度丢失问题
//        BigDecimal b1 = new BigDecimal(Double.toString(d1));
//        BigDecimal b2 = new BigDecimal(Double.toString(d2));
//        System.out.println(b1.add(b2));

        // 优化方案
        BigDecimal b1 = BigDecimal.valueOf(d1);
        BigDecimal b2 = BigDecimal.valueOf(d2);
        BigDecimal result = b1.add(b2);
        double v = result.doubleValue();
        System.out.println(v);

        // 如果是除不断的精度
        BigDecimal b3 = BigDecimal.valueOf(d1);
        BigDecimal b4 = BigDecimal.valueOf(0.3);
        // 指定精度以及 舍入规则
        BigDecimal result2 = b3.divide(b4, 2, RoundingMode.HALF_UP);
        System.out.println(result2.doubleValue());
    }
}
