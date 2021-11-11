package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/10/29
 * @description :指定年份 Y 和月份 M，请你帮忙计算出该月一共有多少天
 */
public class EP1118 {
    public int numberOfDays(int year, int month) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
            if (month == 2) {
                return months[month - 1] + 1;
            }
        }
        return months[month - 1];
    }
}
