package com.onedimension.polymorphicexercise;

public class GoldCard extends Card {

    public GoldCard(String number, String name, String phone, double balance) {
        super(number, name, phone, balance);
    }

    /**
     * 金卡支付享受8折优惠
     */
    @Override
    public void pay(double cost) {
        this.setBalance(this.getBalance() - cost * 0.8);
        System.out.println("支付完成，用户" + this.getName() + "的余额为:" + this.getBalance());
    }

    /**
     * 打印洗车票
     */
    public void printTicket() {
        System.out.println("您获得一张价值200元的洗车券");
    }
}
