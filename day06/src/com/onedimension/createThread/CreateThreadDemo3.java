package com.onedimension.createThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// 多线程创建方式3 实现callable接口,优势: 可以获取执行完毕的结果
public class CreateThreadDemo3 {
    public static void main(String[] args) {
        // 3. 将任务对象交给FutureTask线程任务类,创建FutureTask线程任务对象  未来任务对象
        // 他本质上是一个Runnable接口的实现类
        FutureTask<String> futureTask = new FutureTask<>(new MyCallable(100));
        // 4. 将线程任务对象交给线程类, 创建真正的线程
        Thread thread = new Thread(futureTask);
        // 5. 执行
        thread.start();

        // 6. 获取FutureTask子线程返回结果
        try {
            // 主线程如果执行到这里发现子线程还没有执行完毕,就会阻塞,等待子线程执行完毕返回结果后才会继续往下执行
            System.out.println("获取子线程1返回结果:" + futureTask.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


        FutureTask<String> futureTask2 = new FutureTask<>(new MyCallable(50));
        Thread thread2 = new Thread(futureTask2);
        thread2.start();
        try {
            // 主线程如果执行到这里发现子线程还没有执行完毕,就会阻塞,等待子线程执行完毕返回结果后才会继续往下执行
            System.out.println("获取子线程2返回结果:" + futureTask2.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行" + i);
        }

    }
}

// 1. 定义一个类实现Callable接口 写任务逻辑
class MyCallable implements Callable<String> {

    private int n = 0;

    public MyCallable(int n) {
        this.n = n;
    }

    // 2. 重写call方法
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= this.n; i++) {
            sum += i;
        }
        return "1到" + this.n + "的和为:" + sum;
    }
}
