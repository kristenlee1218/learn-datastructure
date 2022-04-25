package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description : 一个整数数组 nums，请给数组中的每个元素 nums[i]
 * 都加上一个任意数字 x （-k <= x <= k），从而得到一个新数组 result。
 * 返回数组 result 的最大值和最小值之间可能存在的最小差值
 */
public class EP908 {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0], max = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return Math.max(0, max - min - 2 * k);
    }
}
