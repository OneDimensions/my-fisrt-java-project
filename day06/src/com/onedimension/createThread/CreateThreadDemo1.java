package com.onedimension.createThread;

// 创建线程方式1
public class CreateThreadDemo1 {
    public static void main(String[] args) {

        // 4. 创建线程对象
        MyThread myThread = new MyThread();
        // 5. 启动线程 会调用run方法
        myThread.start();

        // 不要把主线程任务放在子线程之前
        // main方法本身就是由主线程执行的
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行任务" + i);
        }
    }
}

// 1. 定义一个子类 继承Thread类
class MyThread extends Thread {
    // 2. 重写run方法
    @Override
    public void run() {
        // 3. 编写需要线程执行的任务
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行任务" + i);
        }
    }
}