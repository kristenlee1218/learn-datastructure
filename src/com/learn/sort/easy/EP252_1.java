package com.learn.sort.easy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author : Kristen
 * @date : 2021/11/4
 * @description : 给定一个会议时间安排的数组 intervals，每个会议
 * 时间都会包括开始和结束的时间 intervals[i]=[starti, endi]，
 * 请判断一个人是否能够参加这里面的全部会议
 */
public class EP252_1 {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(nums -> nums[0]));
        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0]) {
                return false;
            }
        }
        return true;
    }
}
