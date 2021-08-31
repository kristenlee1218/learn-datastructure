package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description :构建一个同样长度的数组 ans，其中对于每个 i（0 <= i < nums.length），
 * 都满足 ans[i] = nums[nums[i]]、返回构建好的数组 ans
 */
public class EP1920 {
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}