package com.onedimension.recursion;

import java.io.File;

public class RecursionDemo2 {
    public static void main(String[] args) {
        // 从某个盘中找到某个文件
        // 这里简化为从项目中找到某个文件,输出其绝对路径

        // 获取项目根路径
        String projectRootPath = System.getProperty("user.dir");

        System.out.println(findFile(projectRootPath, "1.txt"));

    }

    public static String findFile(String path, String fileName) {
        File file = new File(path);
        if (!file.exists()) {
            return null;
        }

        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    // 如果下面返回null了说明没找到, 则继续循环执行寻找下面的文件
                    String foundPath = findFile(f.getPath(), fileName);
                    if(foundPath != null) {
                        return foundPath;
                    }
                } else {
                    if (f.isFile() && f.getName().equals(fileName)) {
                        return f.getAbsolutePath();
                    }
                }
            }
        }
        return null;
    }
}
