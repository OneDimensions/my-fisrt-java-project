package com.onedimension.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarProxyUtil {

    public static StarService proxy(Star star) {

        // 创建代理对象
        StarService proxy = (StarService) Proxy.newProxyInstance(
                // 参数一: 用于指定用哪个类加载器去加载生成的代理类, 一般都是用当前类的类加载器
                StarProxyUtil.class.getClassLoader(), // 获取当前类加载器
                // 参数二: 用于指定代理对象要实现的接口
                // 因为被代理对象实现的接口,代理对象也要全部实现该接口,所以直接获取当前类所实现的接口
                star.getClass().getInterfaces(),
                // 参数三: 用于指定代理对象需要干的事情, 代理对象需要干什么
                new InvocationHandler() {

                    @Override
                    public Object invoke(
                            // 代理对象的主调, 接收到的代理对象本身
                            Object proxy,
                            // 被代理对象调用的方法
                            Method method,
                            // 被代理对象调用的方法的参数
                            Object[] args) throws Throwable {

                        String methodName = method.getName();
                        switch (methodName) {
                            case "sing":
                                System.out.println("代理准备舞台");
                                System.out.println("舞台准备完毕");
                                break;
                            case "dance":
                                System.out.println("代理执行dance方法");
                            default:
                        }
                        // 调用被代理对象方法 获取返回值
                        Object invoke = method.invoke(star, args);
                        return invoke;
                    }
                }
        );

        return  proxy;
    }
}
