package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 一个整数数组 nums，请返回位数为偶数的数字的个数
 */
public class EP1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((num >= 10 && num < 100) || (num >= 1000 && num < 10000) || num == 100000) {
                count++;
            }
        }
        return count;
    }
}
