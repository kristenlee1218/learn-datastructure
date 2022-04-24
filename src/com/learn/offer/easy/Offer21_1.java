package com.learn.offer.easy;

/**
 * @author : Kristen
 * @date : 2022/4/23
 * @description : 输入一个整数数组，实现一个函数来调整该数组中数字
 * 的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分
 */
public class Offer21_1 {
    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            while (left <= right && nums[left] % 2 == 1) {
                left++;
            }
            while (left <= right && nums[right] % 2 == 0) {
                right--;
            }
            if (left > right) {
                break;
            }
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
        }
        return nums;
    }
}
