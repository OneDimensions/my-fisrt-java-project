package com.onedimension.threadSafe;

public class DrawThread extends  Thread{
    Account account;

    public DrawThread(String threadName, Account account) {
        super(threadName);
        this.account = account;
    }

    @Override
    public void run() {
        this.account.drawMoney(10_0000);
    }
}
