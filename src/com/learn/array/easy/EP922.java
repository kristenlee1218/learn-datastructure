package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时，i 也是偶数
 */
public class EP922 {
    public int[] sortArrayByParityII(int[] nums) {
        int[] result = new int[nums.length];
        int j = 0;
        int k = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[j] = nums[i];
                j += 2;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                result[k] = nums[i];
                k += 2;
            }
        }
        return result;
    }
}
