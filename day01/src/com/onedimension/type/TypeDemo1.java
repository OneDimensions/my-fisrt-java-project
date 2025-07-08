package com.onedimension.type;

public class TypeDemo1 {

    // 强制类型转换
    public static void main(String[] args) {
        int i = 1;
        // 顺序转换可以从最小的类型转换到最大的类型
        // 强制类型转换 类型 变量 = (类型) 变量
        byte d = (byte) i;
        printByte(d);

        // 在表达式中,小范围的类型变量会自动转换成表达式中较大范围的类型,再参与运算
        // 表达式中byte short char是直接转换成int参与运算的
    }

    public static void printByte(byte b) {
        System.out.println(b);
    }
}
