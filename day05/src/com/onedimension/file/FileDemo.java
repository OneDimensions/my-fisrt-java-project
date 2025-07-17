package com.onedimension.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        // 文件对象创建 相对路径
        File file = new File("static/file/1.txt");
        System.out.println(file.getName());
        System.out.println(file.length());

        File file2 = new File("static/file/2.txt");
        if (!file2.exists()) {
            // 如果文件不存在 创建
            System.out.println(file2.createNewFile());
        }

        // mkdir() 创建文件夹 只能创建一层文件夹
        // mkdirs() 创建多级文件夹
        // delete 删除文件或文件夹
        // System.out.println(file2.delete());

        // 获取某个目录下的全部一级文件名称
        File file3 = new File("static/file");
        System.out.println(Arrays.stream(Objects.requireNonNull(file3.list())).toList());

        // 获取一级文件对象
        File[] files = file3.listFiles();
        if (files != null) {
            for (File f : files) {
                System.out.println(f.getAbsoluteFile());
            }
        }
    }
}
