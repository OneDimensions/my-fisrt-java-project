package com.onedimension.exception;

// 自定义运行时   异常

/**
 * 继承RuntimeException
 * 重写构造方法
 */
public class AgeRuntimeException extends RuntimeException{
    public AgeRuntimeException() {
    }

    // 调用父类的异常
    public AgeRuntimeException(String message) {
        super(message);
    }
}
