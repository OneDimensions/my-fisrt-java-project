package com.onedimension.reflect;

import java.io.*;
import java.lang.reflect.Field;

// 对于任意一个对象, 都可以把对象的值和对应的字段名存入文件
public final class WriteClassUtil {
    public static void write(Object obj, String pathname) throws IllegalAccessException, IOException {

        File file = new File(pathname);
        // 如果文件不存在, 创建一个文件
        if (!file.exists()) {
            boolean flag = file.createNewFile();
            System.out.println(flag);
        }

        // 创建一个低级的文件输出流 设置追加模式
        OutputStream os = new FileOutputStream(file, true);
        // 创建打印输出流
        try (
                PrintStream ps = new PrintStream(os);
        ) {

            Class c1 = obj.getClass();
            // 获取类的成员变量
            Field[] fields = c1.getDeclaredFields();

            String className = "=========" + c1.getSimpleName() + "=======";
            ps.println(className);
            // 遍历获取的成员变量
            for (Field field : fields) {
                field.setAccessible(true);
                ps.println(field.getName() + "=" + field.get(obj));
            }

        }
    }
}
