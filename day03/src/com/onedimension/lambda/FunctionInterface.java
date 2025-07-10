package com.onedimension.lambda;

/**
 * 函数式接口:
 * 有且只有一个抽象方法的接口
 */
// 可以使用FunctionalInterface注解来显式声明一个函数式接口
@FunctionalInterface
public interface FunctionInterface {
    abstract public void run();
}
