package com.learn.sort.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/11/4
 * @description :给出 N 名运动员的成绩，找出他们的相对名次并授予前三名对应
 * 的奖牌。前三名运动员将会被分别授予 “金牌”，“银牌” 和“ 铜牌”（"Gold Medal",
 * Silver Medal", "Bronze Medal"）
 */
public class EP506_1 {
    public String[] findRelativeRanks(int[] score) {
        String[] str = new String[score.length];
        int[] nums = Arrays.copyOf(score, score.length);
        Arrays.sort(nums);
        for (int i = 0; i < score.length; i++) {
            int rank = score.length - Arrays.binarySearch(nums, score[i]);
            if (rank == 1) {
                str[i] = "Gold Medal";
            } else if (rank == 2) {
                str[i] = "Silver Medal";
            } else if (rank == 3) {
                str[i] = "Bronze Medal";
            } else {
                str[i] = Integer.toString(rank);
            }
        }
        return str;
    }
}
