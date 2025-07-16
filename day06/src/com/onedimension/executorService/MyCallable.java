package com.onedimension.executorService;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        Thread.currentThread().setName("线程" + this.n);
        int sum = 0;
        for (int i = 1; i <= this.n; i++) {
            sum += i;
        }
        return Thread.currentThread().getName() + "执行:1到" + this.n + "的和为:" + sum;
    }
}
