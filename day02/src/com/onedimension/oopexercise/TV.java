package com.onedimension.oopexercise;

/**
 * 创建一个TV类
 */
public class TV extends Device implements DeviceInterface{
    public TV(String name,OpenStatus isOpen) {
        super(name, isOpen);
    }
//    @Override
//    public void open(Device device) {
//        System.out.println("电视打开了, 正在播放节目");
//    }
//
//    @Override
//    public void close(Device device) {
//        System.out.println("电视关闭了");
//    }
}
