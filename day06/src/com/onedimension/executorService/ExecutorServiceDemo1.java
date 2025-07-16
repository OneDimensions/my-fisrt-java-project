package com.onedimension.executorService;

import java.util.concurrent.*;

public class ExecutorServiceDemo1 {
    public static void main(String[] args) {

        // 线程数量计算公式
        // 程序是cpu密集型    核心线程数量 = cpu核数  最大线程数量 = cpu核数 + 1
        // 程序是io密集型    核心线程数量 = cpu核数  最大线程数量 = cpu核数 * 2

        // 1. 使用线程池的实现类ThreadPoolExecutor创建线程池
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
                // discardPolicy 直接丢弃任务 不推荐
                // discardOldestPolicy 丢弃队列中最老的任务,把当前任务放入队列
                // callerRunsPolicy 由主线程直接调任务的run方法, 绕过线程池去执行
                new ThreadPoolExecutor.AbortPolicy()
        );

        // 线程池不会自动关闭, 如果需要,可以手动执行关闭,一般不会关
        // 这个方法直到所有任务执行完毕再关闭
        // pool.shutdown();

        // 2. 使用线程池处理任务
        MyRunnable myRunnable = new MyRunnable();
        pool.execute(myRunnable); // 提交第一个任务创建第一个线程 线程会自动启动处理任务
        pool.execute(myRunnable); // 提交第二个任务创建第二个线程
        pool.execute(myRunnable); // 提交第三个任务创建第三个线程
        // 如果线程池的核心线程都在忙, 新加入的任务会被缓存在任务队列中
        pool.execute(myRunnable); // 队列1 如果上面处理完了处理这个任务时就会 复用之前创建好的线程
        pool.execute(myRunnable); // 队列2
        pool.execute(myRunnable); // 队列3

        // 如果这个加入的任务导致队列已满, 核心线程没有空闲, 则会开始创建临时线程处理
        pool.execute(myRunnable);
        pool.execute(myRunnable);

        // 到了任务队列拒绝阈值, 核心线程和临时线程在跑, 任务队列也满, 就会触发拒绝策略
        pool.execute(myRunnable);

    }
}
