package com.onedimension.threadSafe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String id;
    private double money;

    public void drawMoney(double money) {
        String threadName = Thread.currentThread().getName();
        if (this.money >= money) {
            System.out.println(threadName + "取钱成功，取出了:" + money + "元");
            this.money -= money;
            System.out.println("当前余额为:" + this.money);
        } else {
            System.out.println(threadName + "取钱失败，余额不足");
        }
    }
}
