package com.learn.offer.easy;

/**
 * @author : Kristen
 * @date : 2022/4/23
 * @description : 输入一个整数数组，实现一个函数来调整该数组中数字
 * 的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分
 */
public class Offer21_2 {
    public int[] exchange(int[] nums) {
        int slow = 0, fast = 0;
        while (fast < nums.length) {
            if (nums[fast] % 2 == 1) {
                int tmp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = tmp;
                slow++;
            }
            fast++;
        }
        return nums;
    }
}
