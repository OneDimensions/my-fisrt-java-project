package com.onedimension.polymorphicexercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 创建多个银行卡
        Card[] cards = new Card[1000];
        int index = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            printMenu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Card card = openCard(sc);
                    cards[index++] = card;
                    if (card instanceof GoldCard) {
                        System.out.println("开卡成功，您获得金卡一张");
                    } else if (card instanceof SilverCard) {
                        System.out.println("开卡成功，您获得银卡一张");
                    } else {
                        System.out.println("开卡成功，您获得普通卡一张");
                    }
                    break;
                case 2:
                    System.out.println("请输入车牌号:");
                    String carNo2 = sc.next();
                    for (Card c : cards) {
                        if (c.getCarNo().equals(carNo2)) {
                            System.out.println("请输入消费金额:");
                            double money = sc.nextDouble();
                            pay(money, c);
                            break;
                        }
                    }
                    System.out.println("您输入的车牌号不存在");
                    break;
                case 3:
                    System.out.println("请输入车牌号:");
                    String carNo3 = sc.next();
                    for (Card c : cards) {
                        if (c.getCarNo().equals(carNo3)) {
                            System.out.println("请输入充值金额:");
                            c.charge(sc.nextDouble());
                            break;
                        }
                    }
                    System.out.println("您输入的车牌号不存在");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误");
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("====欢迎使用加油站系统，请选择操作====");
        System.out.println("1.开卡");
        System.out.println("2.加油");
        System.out.println("3.充值");
        System.out.println("4.退出");
        System.out.println("====================================");
        System.out.println("请输入您的选择:");
    }

    public static void pay(Double cost, Card card) {
        double balance = card.getBalance();
        if(cost > balance) {
            System.out.println("您的余额为" + balance + "元，不足以支付" + cost + "元");
            return;
        }

        if (cost >= 200 && card instanceof GoldCard) {
            // 金卡消费满两百元打印洗车券
            ((GoldCard) card).printTicket();
        }
        card.pay(cost);
    }

    /**
     * 开卡
     */
    public static Card openCard(Scanner sc) {
        System.out.println("请输入车牌号码:");
        String carNo = sc.next();
        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入电话号码:");
        String phone = sc.next();

        System.out.println("请输入充值金额:");
        double money = sc.nextDouble();

        if (money >= 2000 && money <= 5000) {
            // 2000元到5000元的银卡
            return new SilverCard(carNo, name, phone, money);
        } else if (money > 5000) {
            // 5000元及以上的金卡
            return new GoldCard(carNo, name, phone, money);
        } else {
            // 普通卡
            return new NormalCard(carNo, name, phone, money);
        }
    }

}
