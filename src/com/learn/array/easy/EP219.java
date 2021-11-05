package com.learn.array.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/7/17
 * @description :给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的
 * 索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值至多为 k
 */

public class EP219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (k >= i - map.get(nums[i])) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
