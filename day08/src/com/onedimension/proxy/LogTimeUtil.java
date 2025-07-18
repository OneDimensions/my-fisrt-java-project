package com.onedimension.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 计算方法运行耗时代理工具
 */
public class LogTimeUtil {

    public static <T> T createProxy(T obj) {
        T proxyInstance = (T) Proxy.newProxyInstance(
                LogTimeUtil.class.getClassLoader(),
                obj.getClass().getInterfaces(),
                (Object proxy, Method method, Object[] args) -> {
                    // 代理实际用处例子: 封装方法运行耗时日志逻辑
                    long start = System.currentTimeMillis();
                    Object invoke = method.invoke(obj, args);
                    long end = System.currentTimeMillis();
                    System.out.println(method.getName() + "方法运行耗时:" + (end - start) / 1000.0 + "秒");
                    return invoke;
                }

        );
        return proxyInstance;
    }
}
