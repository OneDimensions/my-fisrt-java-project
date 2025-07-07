package com.onedimension.variable;

public class VariableDemo {
    public static void main(String[] args) {
        printBaseType();
    }

    // 写一个方法，打印8中基本数据类型的值
    public static void printBaseType() {
        // 字节
        byte b = 1;
        // 字符
        char c = 'a';
        // 短整型
        short s = 1;
        // 整型
        int i = 1;
        // 长整型
        long l = 1L;
        // 浮点型
        float f = 1.0f;
        // 双精度浮点型
        double d = 1.0;
        // 布尔型
        boolean bl = true;
        // 字符串 （引用类型）
        String str = "Hello World";
        // 打印出来
        System.out.printf("b = %d, c = %c, s = %d, i = %d, l = %d, f = %f, d = %f, bl = %b, str = %s%n", b, c, s, i, l, f, d, bl, str);
    }
}
