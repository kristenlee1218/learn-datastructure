package com.learn.sort.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/11/4
 * @description :
 */
public class EP506 {
    public String[] findRelativeRanks(int[] nums) {
        String[] str = new String[nums.length];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
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
