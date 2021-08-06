package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :一个整数数组 nums，请你返回位数为偶数的数字的个数
 */
public class EP1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int n = 0;
            while (num > 0) {
                num /= 10;
                n++;
            }
            count += n % 2 == 0 ? 1 : 0;
        }
        return count;
    }
}
