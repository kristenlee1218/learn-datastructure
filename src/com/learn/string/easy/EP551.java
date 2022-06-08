package com.learn.string.easy;

/**
 * @author ：Kristen
 * @date ：2022/3/30
 * @description : 一个字符串 s 表示一个学生的出勤记录，其中的每个字符用来
 * 标记当天的出勤情况（缺勤、迟到、到场）。记录中只含下面三种字符：
 * 'A'：Absent，缺勤
 * 'L'：Late，迟到
 * 'P'：Present，到场
 * 如果学生能够同时满足下面两个条件，则可以获得出勤奖励：
 * 按总出勤计，学生缺勤（'A'）严格少于两天。
 * 学生不会存在连续 3 天或连续 3 天以上的迟到（'L'）记录
 * 如果学生可以获得出勤奖励，返回 true；否则返回 false
 */
public class EP551 {
    public boolean checkRecord(String s) {
        return s.indexOf("A") == s.lastIndexOf("A") && !s.contains("LLL");
    }
}
