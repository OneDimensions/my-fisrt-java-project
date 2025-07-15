package com.onedimension.createThread;


public class CreateThreadDemo4 {
    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2("子线程1");
        // 线程常用方法
        // 设置线程名字
        // myThread.setName("子线程1");

        myThread.start();

        // 线程名字 默认名字是Thread-索引
        System.out.println("子线程名字:" + myThread.getName());

        // 线程优先级
        System.out.println("线程优先级:" + myThread.getPriority());
        // 线程状态
        System.out.println("线程状态:" + myThread.getState());

        // 获取当前线程 哪个线程调用此方法, 就返回哪个线程
        Thread currentThread = Thread.currentThread();
        currentThread.setName("主线程");
        // 线程名字
        System.out.println("当前主线程名字:" + currentThread.getName());

        MyThread2 myThread2 = new MyThread2("子线程2");
        myThread2.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(currentThread.getName()+ "执行任务:" + i);
            if(i == 2) {
                try {
                    // join方法会让当前线程进入休眠状态 直到myThread2线程执行完毕
                    // 插队
                    myThread2.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}

class MyThread2 extends Thread {
    public MyThread2(String name) {
        super(name);
    }

    // 2. 重写run方法
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        // 3. 编写需要线程执行的任务
        for (int i = 0; i < 5; i++) {
            try {
                // 让当前线程进入休眠状态 直到休眠时间到 单位毫秒
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(currentThread.getName() + "执行任务" + i);
        }
    }
}