package com.onedimension.method;

public class Method01 {
    /**
     * 方法的结构
     * public: 公共的
     * static: 静态的
     * void: 返回值为void
     * main: 方法名
     * String[] args: 参数
     *
     * @param args
     */
    public static void main(String[] args) {
        method(1);
        method('a');
        method("hello world", 1);
    }

    /**
     * 方法重载： 同一个类中方法名相同，但是参数不同
     * 方法重载只看方法名相同，参数列表不同(类型，个数， 顺序)，其他的不关心
     */
    private void method(String str) {
        System.out.println(str);
    }

    private static void method(int i) {
        System.out.println(i);
    }

    private static int method(String str, int i) {
        System.out.println(str + i);
        return i;
    }
}
