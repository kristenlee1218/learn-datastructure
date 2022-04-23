package com.learn.offer.easy;

/**
 * @author : Kristen
 * @date : 2022/4/23
 * @description : 一个长度为 n-1 的递增排序数组中的所有数字都
 * 是唯一的，并且每个数字都在范围 0～n-1 之内。在范围 0～n-1 内
 * 的 n 个数字中有且只有一个数字不在该数组中，请找出这个数字
 */
public class Offer53_2 {
    public int missingNumber(int[] nums) {
        if (nums.length == 0) {
            if (nums[0] == 0) {
                return 1;
            }
            return 0;
        }
        int count = 0;
        for (int num : nums) {
            if (num != count) {
                return count;
            }
            count++;
        }
        return count;
    }
}
