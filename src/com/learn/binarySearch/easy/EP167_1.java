package com.learn.binarySearch.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/7/17
 * @description :给定一个已按照升序排列的整数数组 numbers，
 * 请从数组中找出两个数满足相加之和等于目标数 target
 */
public class EP167_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp) + 1, i + 1};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
