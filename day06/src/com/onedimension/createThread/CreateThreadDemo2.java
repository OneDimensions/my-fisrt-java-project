package com.onedimension.createThread;

// 多线程创建方式2 runnable
public class CreateThreadDemo2 {

    public static void main(String[] args) {
        // 3. 创建线程任务对象 这个只是代表一个任务 不能直接启动
        Runnable myRunnable = new MyRunnable();
        // 4. 需要通过创建线程对象,包装线程任务类来启动
        Thread thread = new Thread(myRunnable);
        // 5. 启动线程
        thread.start();

        // 匿名线程
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("匿名线程执行任务" + i);
            }
        }).start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("匿名线程执行任务" + i);
//                }
//            }
//        }).start();


        // 主线程任务
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行任务" + i);
        }
    }
}

// 1. 定义一个线程任务类,实现Runnable接口
class MyRunnable implements Runnable {
    // 2. 重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行任务" + i);
        }
    }
}
