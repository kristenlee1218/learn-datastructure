package com.learn.sort.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/11/4
 * @description :给出 N 名运动员的成绩，找出他们的相对名次并授予前三名对应的奖牌。
 * 前三名运动员将会被分别授予 “金牌”，“银牌” 和 “铜牌”（"Gold Medal",
 * Silver Medal", "Bronze Medal"）
 */
public class EP506 {
    public String[] findRelativeRanks(int[] score) {
        String[] str = new String[score.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }
        Arrays.sort(score);
        int j = score.length - 1;
        for (int i = 0; i < str.length; i++) {
            if (j >= 0) {
                if (j == score.length - 1) {
                    str[map.get(score[j])] = "Gold Medal";
                } else if (j == score.length - 2) {
                    str[map.get(score[j])] = "Silver Medal";
                } else if (j == score.length - 3) {
                    str[map.get(score[j])] = "Bronze Medal";
                } else {
                    str[map.get(score[j])] = String.valueOf(i + 1);
                }
                j--;
            }
        }
        return str;
    }
}
