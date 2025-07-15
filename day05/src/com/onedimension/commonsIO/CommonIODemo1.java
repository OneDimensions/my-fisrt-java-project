package com.onedimension.commonsIO;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonIODemo1 {
    public static void main(String[] args) {

        // 拷贝文件夹
        try {
            FileUtils.copyDirectory(new File("static/file"), new File("static/fileCopy"));

            FileUtils.copyFile(new File("static/file/1.txt"), new File("static/fileCopy/1_copy.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
