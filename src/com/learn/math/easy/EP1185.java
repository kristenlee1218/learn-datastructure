package com.learn.math.easy;

import java.util.Calendar;

/**
 * @author : Kristen
 * @date : 2021/10/18
 * @description : 设计一个算法来判断它是对应一周中的哪一天。输入为三个整数：day、
 * month 和 year，返回的结果必须是这几个值中的一个 {"Sunday", "Monday",
 * "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}
 */
public class EP1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] week = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        return week[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }
}
