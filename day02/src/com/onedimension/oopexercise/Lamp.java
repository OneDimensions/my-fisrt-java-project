package com.onedimension.oopexercise;

public class Lamp extends Device implements DeviceInterface{

    public Lamp(String name,OpenStatus isOpen) {
        super(name, isOpen);
    }

//    @Override
//    public void open(Device device) {
//        System.out.println("电灯打开了");
//    }
//
//    @Override
//    public void close(Device device) {
//        System.out.println("电灯关闭了");
//    }
}
