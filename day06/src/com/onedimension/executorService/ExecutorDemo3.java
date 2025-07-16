package com.onedimension.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo3 {
    public static void main(String[] args) {
        // 通过线程池工具类 创建线程池
        // 固定数量的线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);

        Future f1 = pool.submit(new MyCallable(1));
        Future f2 = pool.submit(new MyCallable(2));
        Future f3 = pool.submit(new MyCallable(3));
        Future f4 = pool.submit(new MyCallable(4));

        try {
            System.out.println("f1:" + f1.get());
            System.out.println("f2:" + f2.get());
            System.out.println("f3:" + f3.get());
            System.out.println("f4:" + f4.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
