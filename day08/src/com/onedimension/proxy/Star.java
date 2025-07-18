package com.onedimension.proxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// 代理对象和被代理对象都要实现接口
public class Star implements StarService {
    private String name;

    @Override
    public void sing(String song) {
        System.out.println("明星" + name + "正在唱：" + song);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("明星" + name + "唱完了" + song);
    }

    @Override
    public String dance() {
        System.out.println("明星" + name + "正在跳舞");
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("明星" + name + "跳完舞了");
        return this.name + "说:谢谢!";
    }
}
