package com.onedimension.reflect;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class WriteClassUtilTest {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        Student s1 = new Student("张三", 24, 90.1);
        Animal a1 = new Animal("小猫", 2);
        String pathname = "static/file/classInfo.txt";
        WriteClassUtil.write(s1, pathname);
        WriteClassUtil.write(a1, pathname);

    }

 // 待研究 junit中使用相对路径文件创建会报错
//    @Test
//    public void test() throws Exception {
//        Student s1 = new Student("张三", 24, 90.1);
//        Animal a1 = new Animal("小猫", 2);
//        String pathname = "static/file/2.txt";
////        WriteClassUtil.write(s1, pathname);
////        WriteClassUtil.write(a1, pathname);
//        File file = new File(pathname);
//        // 如果文件不存在, 创建一个文件
//        if (!file.exists()) {
//            boolean flag = file.createNewFile();
//            System.out.println(flag);
//        }
//
//    }
}
