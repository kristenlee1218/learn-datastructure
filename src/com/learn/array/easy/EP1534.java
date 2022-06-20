package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : 一个整数数组 nums，以及 a、b 、c 三个整数。
 * 请统计其中好三元组的数量。如果三元组 (nums[i], nums[j], nums[k])
 * 满足下列全部条件，则认为它是一个 好三元组
 * 0 <= i < j < k < nums.length
 * |nums[i] - nums[j]| <= a
 * |nums[j] - nums[k]| <= b
 * |nums[i] - nums[k]| <= c
 * 其中 |x| 表示 x 的绝对值。返回好三元组的数量
 */
public class EP1534 {
    public int countGoodTriplets(int[] nums, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (Math.abs(nums[i] - nums[j]) <= a) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (Math.abs(nums[j] - nums[k])
                                <= b && Math.abs(nums[i] - nums[k]) <= c) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
