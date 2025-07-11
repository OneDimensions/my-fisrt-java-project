package com.onedimension.exception;

public class ExceptionDemo1 {

    /**
     * 异常有两种
     * 1. 运行时异常
     * 2. 编译时异常
     */
    public static void main(String[] args) {

        try {
            System.out.println(div(10, 0));
        } catch (Exception e) { // 捕获运行时异常
            // 输出异常信息
            e.printStackTrace();
        }

        try {
            arrayError(3);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static void arrayError(int i) {
        if(i > 2){
            // 抛出一个运行时异常 throw new Exception
            // throw new ArrayIndexOutOfBoundsException("数组越界"); // 具体的异常
            throw new RuntimeException("数组越界");
        }
        int[] arr = new int[]{1, 2};
        System.out.println(arr[i]);
    }

    // 编译时异常需要把异常往上抛或者直接捕获处理 throws Exception
    public static int div(int a, int b) throws Exception {
        if(b == 0) {
            // 抛出一个编译时异常
             throw new Exception("除数不能为0");
        }

        return a / b;
    }
}
