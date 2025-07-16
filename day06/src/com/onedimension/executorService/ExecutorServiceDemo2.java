package com.onedimension.executorService;

import java.util.concurrent.*;

public class ExecutorServiceDemo2 {
    public static void main(String[] args) {
        ExecutorService pool = new ThreadPoolExecutor(
                // 核心线程池数量
                3,
                // 最大线程池数量
                5,
                // 线程存活时间
                10,
                // 存活时间单位
                TimeUnit.SECONDS,
                // 线程任务队列
                new ArrayBlockingQueue<>(3),
                // 线程池工厂
                Executors.defaultThreadFactory(),
                // 拒绝策略 默认策略为抛异常
                new ThreadPoolExecutor.AbortPolicy()
        );

        // 执行callable任务 使用submit提交 得到 FutureTask
        Future<String> t1 = pool.submit(new MyCallable(100));
        Future<String> t2 = pool.submit(new MyCallable(200));
        Future<String> t3 = pool.submit(new MyCallable(300));
        Future<String> t4 = pool.submit(new MyCallable(400));
        Future<String> t5 = pool.submit(new MyCallable(500));
        Future<String> t6 = pool.submit(new MyCallable(600));
        Future<String> t7 = pool.submit(new MyCallable(700));

        try {
            System.out.println("t1:" + t1.get());
            System.out.println("t2:" + t2.get());
            System.out.println("t3:" + t3.get());
            System.out.println("t4:" + t4.get());
            System.out.println("t5:" + t5.get());
            System.out.println("t6:" + t6.get());
            System.out.println("t7:" + t7.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
