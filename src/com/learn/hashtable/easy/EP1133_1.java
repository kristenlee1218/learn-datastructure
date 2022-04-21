package com.learn.hashtable.easy;

/**
 * @author : Kristen
 * @date : 2022/1/4
 * @description : 一个整数数组 nums，请找出并返回在该数组中仅
 * 出现一次的最大整数。如果不存在这个只出现一次的整数，则返回 -1
 */
public class EP1133_1 {
    public int largestUniqueNumber(int[] nums) {
        int[] result = new int[1001];
        for (int value : nums) {
            result[value]++;
        }
        for (int i = 1000; i >= 0; i--) {
            if (result[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}