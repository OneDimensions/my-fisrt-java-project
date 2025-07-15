package com.onedimension.threadSafe;

// 模拟线程安全问题
public class ThreadSafeDemo1 {
    public static void main(String[] args) {
        Account account = new Account("001", 10_0000);

        // 多个线程操作同一个账户 模拟线程安全问题
        new DrawThread("小红", account).start();
        new DrawThread("小明", account).start();
    }
}
