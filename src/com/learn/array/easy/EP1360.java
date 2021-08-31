package com.learn.array.easy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description :编写一个程序来计算两个日期之间隔了多少天。日期以字符串形式给出，格式为 YYYY-MM-DD
 */
public class EP1360 {
    public int daysBetweenDates(String date1, String date2) {
        return (int) Math.abs(LocalDate.parse(date1).until(LocalDate.parse(date2), ChronoUnit.DAYS));
    }
}
