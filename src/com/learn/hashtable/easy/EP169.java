package com.learn.hashtable.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/8/19
 * @description :给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组
 * 中出现次数大于 n/2 的元素、可以假设数组是非空的，并且给定的数组总是存在多数元素
 */
public class EP169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
