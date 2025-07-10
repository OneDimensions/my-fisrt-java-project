package com.onedimension.oopexercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Device implements DeviceInterface{
    /**
     * 设备名
     */
    private String name;
    /**
     * 是否开启
     */
    private OpenStatus isOpen;

    @Override
    public void open() {
        this.setIsOpen(OpenStatus.OPEN);
        System.out.println(this.getName() + " 打开了");
    }

    @Override
    public void close() {
        this.setIsOpen(OpenStatus.CLOSE);
        System.out.println(this.getName() + " 关闭了");
    }
}
