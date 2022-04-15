package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 给一个按 YYYY-MM-DD 格式表示日期的字符串 date，请计算并返
 * 回该日期是当年的第几天。1 月 1 日是每年的第 1 天，1 月 2 日是每年的第 2 天，
 * 每个月的天数与现行公元纪年法（格里高利历）一致
 */
public class EP1154 {
    public int dayOfYear(String date) {
        String[] str = date.split("-");
        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int day = Integer.parseInt(str[2]);
        int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            days[1] = 29;
        }
        int result = 0;
        for (int i = 0; i < month - 1; i++) {
            result += days[i];
        }
        return result + day;
    }
}
