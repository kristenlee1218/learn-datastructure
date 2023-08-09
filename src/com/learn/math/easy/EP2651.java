package com.learn.math.easy;

/**
 * @author ：Kristen
 * @date ：2023/8/9
 * @description : 一个正整数 arrivalTime 表示列车正点到站的时间（单位：小时），另给你一个正
 * 整数 delayedTime 表示列车延误的小时数。返回列车实际到站的时间
 */
public class EP2651 {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int sum = arrivalTime + delayedTime;
        if (sum >= 24) {
            sum -= 24;
        }
        return sum;
    }
}
