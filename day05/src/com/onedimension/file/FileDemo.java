package com.onedimension.file;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        // 文件对象创建
        File file = new File(projectPath + "/static/file/1.txt");
        System.out.println(file.getName());
        System.out.println(file.length());
    }
}
