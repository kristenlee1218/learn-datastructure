package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :给一个正整数数组 arr ，请你计算所有可能的奇数长度子数组的和。
 * 子数组定义为原数组中的一个连续子序列。请返回 arr 中 所有奇数长度子数组的和
 */
public class EP1588 {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // 定义以arr[i]开头的满足条件的奇数长度数组的和
            int temp = 0;
            for (int j = i; j < arr.length; j++) {
                temp += arr[j];
                // 奇数长度时做加法
                if ((j - i) % 2 == 0) {
                    sum += temp;
                }
            }
        }
        return sum;
    }
}
