package com.onedimension.ThreadExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        List<Staff> staffList = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            staffList.add(new Staff(i, 0));
        }

        RedEnvelopeList redEnvelopeList = new RedEnvelopeList(200);

        // 创建一个线程池
        ExecutorService pool = new ThreadPoolExecutor(50, 100,
                1000, TimeUnit.SECONDS, new ArrayBlockingQueue<>(50));

        List<Callable<Integer>> tasks = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            tasks.add(new GrabRedEnvelopeThread(staffList.get(i), redEnvelopeList));
            // pool.submit(new GrabRedEnvelopeThread(staff.get(i), redEnvelopeList));
        }

        try {
            List<Future<Integer>> futures = pool.invokeAll(tasks);
            System.out.println("====结束=====");
//            for (Future<Integer> future : futures) {
//                System.out.println(future.get());
//            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        staffList.sort(((o1, o2) -> o2.getMoney() - o1.getMoney()));
        System.out.println("结束, 排名如下:");
        staffList.forEach(staff -> System.out.println(staff.getId() + "号员工抢了:" + staff.getMoney() + "元"));

        int totalMoney = staffList.stream().mapToInt(Staff::getMoney).sum();
        System.out.println("总金额为:" + totalMoney);
    }
}
