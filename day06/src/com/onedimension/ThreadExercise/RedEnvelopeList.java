package com.onedimension.ThreadExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RedEnvelopeList {
    private final List<RedEnvelope> redEnvelopeList = new ArrayList<>();

    /**
     * 生产红包
     *
     * @param num 数量
     */
    public RedEnvelopeList(int num) {
        // 大红包 31- 100 元 个数为总的80%
        int bigRed = (int) (num * 0.8);
        // 小红包 1 - 30元
        int smallRed = num - bigRed;
        int totalMoney = 0;

        for (int i = 0; i < bigRed; i++) {
            int money = (int) (Math.random() * 70 + 31);
            totalMoney += money;
            redEnvelopeList.add(new RedEnvelope(money));
        }
        for (int i = 0; i < smallRed; i++) {
            int money = (int) (Math.random() * 30 + 1);
            totalMoney += money;
            redEnvelopeList.add(new RedEnvelope(money));
        }
        // 打乱红包顺序
        Collections.shuffle(redEnvelopeList);
        System.out.println("红包已生成：" + redEnvelopeList);
        System.out.println("总金额" + totalMoney);
    }

    /**
     * 抢红包
     */
    public int grabRedEnvelope(Staff staff) {
        while (true) {
            synchronized (staff) {
                if (!redEnvelopeList.isEmpty()) {
                    RedEnvelope redEnvelope = redEnvelopeList.removeFirst();
                    // System.out.println(Thread.currentThread().getName() + "抢到红包：" + redEnvelope.getMoney() + "元");
                    staff.setMoney(staff.getMoney() + redEnvelope.getMoney());
                } else {
                    System.out.println(Thread.currentThread().getName() + "想抢,但是没有了");
                    return 0;
                }
            }
        }
    }
}
