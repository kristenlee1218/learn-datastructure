package com.learn.offer.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2022/5/2
 * @description : 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 可以假设数组是非空的，并且给定的数组总是存在多数元素
 */
public class Offer39 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
