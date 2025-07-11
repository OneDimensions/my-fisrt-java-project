package com.onedimension.exception;

public class TestCustomException {
    public static void main(String[] args) {

        // 捕获自定义运行时异常
        try {
            checkAge(-1);
        } catch (AgeRuntimeException e) {
            e.printStackTrace();
        }

        // 捕获自定义编译时异常
        try {
            checkSex("直升机");
        } catch (SexException e) {
            e.printStackTrace();
        }

    }

    // 抛出自定义运行时异常
    // 运行时异常会自动抛出 不声明 throws AgeRuntimeException也可以
    public static void checkAge(int age) throws AgeRuntimeException {
        if (age < 0) {
            throw new AgeRuntimeException("年龄不能小于0 - 自定义异常抛出");
        }
    }

    // 抛出自定义编译时异常
    public static void checkSex(String sex) throws SexException {
        if(!sex.equals("男") && !sex.equals("女")) {
            throw new SexException("性别只能是男或女 - 自定义编译时异常抛出");
        }
    }
}
