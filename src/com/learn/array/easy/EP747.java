package com.learn.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/7/18
 * @description :给你一个整数数组 nums，其中总是存在唯一的一个最大整数
 * 请你找出数组中的最大元素并检查它是否 至少是数组中每个其他数字的两倍
 * 如果是，则返回最大元素的下标，否则返回 -1
 */
public class EP747 {
    public int dominantIndex(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        Arrays.sort(nums);
        System.out.println(nums[nums.length - 1]);
        if (nums[nums.length - 1] >= 2 * nums[nums.length - 2]) {
            return map.get(nums[nums.length - 1]);
        }
        return -1;
    }
}
