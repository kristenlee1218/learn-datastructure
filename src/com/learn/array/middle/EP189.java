package com.learn.array.middle;

/**
 * @author : Kristen
 * @date : 2021/11/4
 * @description :给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数
 */
public class EP189 {
    public void rotate(int[] nums, int k) {
        int[] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArr[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, nums.length);
    }
}
