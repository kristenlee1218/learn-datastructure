package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/7/17
 * @description :给一个非空数组，返回此数组中第三大的数。
 * 如果不存在，则返回数组中最大的数
 */

public class EP414 {
    public static int thirdMax(int[] nums) {
        int one = Integer.MIN_VALUE;
        int two = Integer.MIN_VALUE;
        int three = Integer.MIN_VALUE;
        boolean b = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= one) {
                one = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= two && nums[i] != one) {
                two = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= three && nums[i] != two && nums[i] != one) {
                three = nums[i];
                b = true;
            }
        }
        return !b ? one : three;
    }
}
