package com.learn.test;

import java.util.Calendar;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :
 */
public class Test1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2020);
        System.out.println(calendar.getWeeksInWeekYear());
    }
}