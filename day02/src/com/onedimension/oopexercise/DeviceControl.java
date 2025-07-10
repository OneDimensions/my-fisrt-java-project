package com.onedimension.oopexercise;

public class DeviceControl {
    private final static DeviceControl deviceControl = new DeviceControl();

    private DeviceControl() {
    }

    public void open(Device device) {
        device.open();
    }

    public void close(Device device) {
        device.close();
    }

    public static DeviceControl getInstance() {
        return deviceControl;
    }
}
