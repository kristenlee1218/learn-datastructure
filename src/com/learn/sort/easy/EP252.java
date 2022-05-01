package com.learn.sort.easy;

/**
 * @author : Kristen
 * @date : 2021/11/4
 * @description : 给定一个会议时间安排的数组 intervals，每个会议
 * 时间都会包括开始和结束的时间 intervals[i]=[starti, endi]，
 * 请判断一个人是否能够参加这里面的全部会议
 */
public class EP252 {
    public boolean canAttendMeetings(int[][] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (overlap(intervals[i], intervals[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean overlap(int[] a, int[] b) {
        return (Math.min(a[1], b[1]) > Math.max(a[0], b[0]));
    }
}