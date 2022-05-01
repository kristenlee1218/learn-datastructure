package com.learn.sort.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 给定一个非负整数数组 A，A 中一半整数是奇数，一半整数是偶数。对
 * 数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时，i 也是偶数
 */
public class EP922 {
    public int[] sortArrayByParityII(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0;
        int j = 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[i] = num;
                i += 2;
            }
        }
        for (int num : nums) {
            if (num % 2 != 0) {
                result[j] = num;
                j += 2;
            }
        }
        return result;
    }
}
