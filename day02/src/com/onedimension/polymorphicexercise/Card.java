package com.onedimension.polymorphicexercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 使用lombok的@Data注解 可以实现为类自动添加 get set 方法 和 无参构造器还有重写toString
@Data
// 添加无参构造器
@NoArgsConstructor
// 添加有参构造器
@AllArgsConstructor
public class Card {
    /**
     * 车牌号码
     */
    private String carNo;
    /**
     * 车主姓名
     */
    private String name;

    /**
     * 电话号码
     */
    private String phone;
    /**
     * 卡片余额
     */
    private double balance = 0;

    /**
     * 充值
     */
    public void charge(double money) {
        this.balance += money;
        System.out.println("充值成功, 用户:" + this.name + "的当前余额为:" + this.balance);
    }

    /**
     * 消费
     *
     * @param cost
     */
    public void pay(double cost) {
    }

}
