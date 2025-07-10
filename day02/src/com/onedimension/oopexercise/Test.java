package com.onedimension.oopexercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Device tv = new TV("电视", OpenStatus.CLOSE);
        Device lamp = new Lamp("吊灯", OpenStatus.CLOSE);
        Device air = new Air("空调", OpenStatus.CLOSE);
        Device washingMachine = new WashingMachine("洗衣机", OpenStatus.CLOSE);
        Scanner scanner = new Scanner(System.in);
        Devices devices = new Devices(new Device[]{tv, lamp, air, washingMachine});
        Device[] devicesList = devices.getDevices();


        while (true) {
            System.out.println("请选择您要控制的设备");

            for (int i = 0; i < devicesList.length; i++) {
                System.out.println(i + 1 + ":" + devicesList[i].getName() + ":" + devicesList[i].getIsOpen());
            }
            int choice = scanner.nextInt();

            if (choice < 1 || choice > devicesList.length) {
                System.out.println("输入错误，请重新输入");
                continue;
            }
            // 获取当前设备
            Device currentDevice = devicesList[choice - 1];
            DeviceControl deviceControl = DeviceControl.getInstance();
            System.out.println("当前设备状态:" + currentDevice.getIsOpen());

            System.out.println("请选择您要执行的操作");
            System.out.println("1:打开");
            System.out.println("2:关闭");
            int operation = scanner.nextInt();
            if (operation != 1 && operation != 2) {
                System.out.println("输入错误，请重新输入");
                continue;
            }

            if (operation == 1) {
                deviceControl.open(currentDevice);

            } else {
                deviceControl.close(currentDevice);
            }
        }

    }
}
