package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description :一个严格升序排列的正整数数组 arr 和一个整数 k。请找到这个数组里第 k 个缺失的正整数。
 */
public class EP1539 {
    public int findKthPositive(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - i - 1 >= k) {
                return k + i;
            }
        }
        return k + arr.length;
    }
}
