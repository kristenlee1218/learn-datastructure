package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :两个整数数组 startTime（开始时间）和 endTime（结束时间），
 * 并指定一个整数 queryTime 作为查询时间、已知第 i 名学生在 startTime[i]
 * 时开始写作业并于 endTime[i] 时完成作业、请返回在查询时间 queryTime
 * 时正在做作业的学生人数。形式上，返回能够使 queryTime 处于区间
 * [startTime[i], endTime[i]]（含）的学生人数
 */
public class EP1450 {

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                count++;
            }
        }
        return count;
    }
}
