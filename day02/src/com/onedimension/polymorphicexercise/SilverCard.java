package com.onedimension.polymorphicexercise;

public class SilverCard extends Card {

    public SilverCard(String number, String name, String phone, double balance) {
        super(number, name, phone, balance);
    }

    /**
     * 银卡支付享受9折优惠
     */
    @Override
    public void pay(double cost) {
        this.setBalance(this.getBalance() - cost * 0.9);
        System.out.println("支付完成，用户" + this.getName() + "的余额为:" + this.getBalance());
    }
}
