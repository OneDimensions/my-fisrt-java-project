package com.onedimension.threadSafe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String id;
    private double money;
    // 方法三: lock锁
    private final Lock lk = new ReentrantLock(); // 加final保护锁不被修改

    public void drawMoney(double money) {
    // 方式二: 同步方法
    // public synchronized void drawMoney(double money) {
        String threadName = Thread.currentThread().getName();

        // 线程同步方式一: 同步代码块 括号中必须是唯一对象
        // 当线程同步代码块中代码执行时会自动加锁, 执行完毕时会自动解锁
        // 锁对象使用规范
        // 建议使用共享资源作为锁对象 实例方法使用this作为锁对象
        // 静态方法使用类名.class作为锁对象
        //        synchronized (this) {
        //            if (this.money >= money) {
        //                System.out.println(threadName + "取钱成功，取出了:" + money + "元");
        //                this.money -= money;
        //                System.out.println("当前余额为:" + this.money);
        //            } else {
        //                System.out.println(threadName + "取钱失败，余额不足");
        //            }
        //        }


        try {
            // 上锁
            lk.lock();
            if (this.money >= money) {
                System.out.println(threadName + "取钱成功，取出了:" + money + "元");
                this.money -= money;
                System.out.println("当前余额为:" + this.money);
            } else {
                System.out.println(threadName + "取钱失败，余额不足");
            }
        } finally {
            // 解锁
            lk.unlock();
        }
    }
}
