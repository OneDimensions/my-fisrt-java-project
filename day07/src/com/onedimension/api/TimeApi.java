package com.onedimension.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeApi {
    public static void main(String[] args) {

        // 获取时间对象 LocalDate LocalTime LocalDateTime
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getYear());

        LocalDateTime now2 = now.plusSeconds(60); // 60秒后
        System.out.println(now2);

        // 格式话时间
        // 创建一个格式化对象 DateTimeFormatter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String format = now.format(dateTimeFormatter);
        System.out.println(format);
    }
}
