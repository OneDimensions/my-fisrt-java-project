package com.onedimension.junitDemo;

public class StringUtil {
    public static void printNumber(String name) {
        if (name == null | "".equals(name)) {
            return;
        }
        System.out.println("长度为:" + name.length());
    }

    /**
     * 获取字符串最大索引
     *
     * @param data 字符串
     * @return 最大索引
     */
    public static int getMaxIndex(String data) {
        if (data == null | "".equals(data)) {
            return -1;
        }
        return data.length() - 1;
    }
}
