package com.onedimension.proxy;

public class Test {

    public static void main(String[] args) {
        // 创建代理对象

        // 1. 准备一个明星对象
        Star star = new Star("张三");

        // 2. 为这个明星对象创建专属于他的代理对象
        // 这个代理对象的类型只能是接口, 这样动态代理才能生成他的实例
        StarService proxy = StarProxyUtil.proxy(star);

        // 3. 通过代理对象去调用明星对象中的方法
        // 代理对象调用时, 会回调代理工具类中的invoke方法, 并将参数传入
        proxy.sing("张三的歌");
        String s = proxy.dance();
        System.out.println(s);

        System.out.println("=====换场=====");


        // 代理实际用处例子: 封装方法运行耗时日志逻辑
        StarService starProxy2 = LogTimeUtil.createProxy(new Star("李四"));
        starProxy2.sing("张三的歌");
        System.out.println(starProxy2.dance());

    }
}
