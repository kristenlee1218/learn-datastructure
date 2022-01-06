package com.learn.array.middle;

/**
 * @author : Kristen
 * @date : 2021/11/4
 * @description :给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
 */
public class EP189_1 {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}
