package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :给一个按 YYYY-MM-DD 格式表示日期的字符串 date，
 * 请计算并返回该日期是当年的第几天。通常情况下，认为 1 月 1 日是每年
 * 的第 1 天，1 月 2 日是每年的第 2 天，依此类推。
 * 每个月的天数与现行公元纪年法（格里高利历）一致
 */
public class EP1154 {
    public int dayOfYear(String date) {
        String[] dates = date.split("-");
        int year = Integer.parseInt(dates[0]);
        int month = Integer.parseInt(dates[1]);
        int day = Integer.parseInt(dates[2]);
        int result = 0;
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            days[1] = 29;
        }
        for (int i = 0; i < month - 1; i++) {
            result += days[i];
        }
        return result + day;
    }
}
