package com.learn.sort.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/11/4
 * @description :给出 N 名运动员的成绩，找出他们的相对名次并授予前三名对应
 * 的奖牌。前三名运动员将会被分别授予 “金牌”，“银牌” 和“ 铜牌”（"Gold Medal",
 * "Silver Medal", "Bronze Medal"）
 */
public class EP506 {
    public String[] findRelativeRanks(int[] nums) {
        String[] str = new String[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        Arrays.sort(nums);
        int j = nums.length - 1;
        for (int i = 0; i < str.length; i++) {
            if (j >= 0) {
                if (j == nums.length - 1) {
                    str[map.get(nums[j])] = "Gold Medal";
                } else if (j == nums.length - 2) {
                    str[map.get(nums[j])] = "Silver Medal";
                } else if (j == nums.length - 3) {
                    str[map.get(nums[j])] = "Bronze Medal";
                } else {
                    str[map.get(nums[j])] = i + 1 + "";
                }
                j--;
            }
        }
        return str;
    }
}
