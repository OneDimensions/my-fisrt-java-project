package com.onedimension.polymorphicexercise;

public class NormalCard extends  Card {
    public NormalCard(String carNo, String name, String phone, double balance) {
        super(carNo, name, phone, balance);
    }

    @Override
    public void pay(double cost) {
        this.setBalance(this.getBalance() - cost);
        System.out.println("支付完成，用户" + this.getName() + "的余额为:" + this.getBalance());
    }
}
