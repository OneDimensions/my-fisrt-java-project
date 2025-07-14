package com.onedimension.params;

import java.util.Arrays;

public class ParamsDemo1 {
    public static void main(String[] args) {

        System.out.println(add(1, 2, 3, 4, 5));
    }

    // ...可变参数, 形参类型...变量名 可传一个或多个或不传
    // 可变参数在形参列表中只能有一个, 必须放在形参的 最后
    public static int add(int...numbers) {
        // 可变参数实际上是一个数组
        return Arrays.stream(numbers).sum();
    }
}
