package com.onedimension.oopexercise;

public class WashingMachine extends Device implements DeviceInterface{
    public WashingMachine(String name,OpenStatus isOpen) {
        super(name, isOpen);
    }
//    @Override
//    public void open(Device device) {
//        System.out.println("洗衣机打开了, 正在洗衣服");
//    }
//
//    @Override
//    public void close(Device device) {
//        System.out.println("洗衣机关闭了");
//    }
}
