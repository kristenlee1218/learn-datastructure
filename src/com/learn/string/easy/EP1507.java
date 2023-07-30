package com.learn.string.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 一个字符串 date，它的格式为 Day Month Year，
 * 其中 Day 是集合 {"1st", "2nd", "3rd", "4th", ..., "30th",
 * "31st"} 中的一个元素。Month 是集合 {"Jan", "Feb", "Mar",
 * "Apr", "May", "Jun", "Jul","Aug", "Sep", "Oct", "Nov",
 * "Dec"} 中的一个元素。Year 的范围在 [1900,2100] 之间、请将字
 * 符串转变为 YYYY-MM-DD 的格式
 */
public class EP1507 {
    public String reformatDate(String date) {
        String[] str = date.split(" ");
        StringBuilder result = new StringBuilder(str[2] + "-");
        String[] month = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (int i = 0; i < month.length; i++) {
            if (str[1].equals(month[i])) {
                if (i < 9) {
                    result.append("0").append(i + 1);
                } else {
                    result.append(i + 1);
                }
            }
        }
        String day = str[0].substring(0, str[0].length() - 2);
        return result + "-" + (day.length() > 1 ? day : "0" + day);
    }
}
