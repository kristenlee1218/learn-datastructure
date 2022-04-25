package com.learn.hashtable.easy;

/**
 * @author : Kristen
 * @date : 2021/7/25
 * @description : 一个整数数组 nums、如果一组数字 (i,j) 满足
 * nums[i] == nums[j] 且 i < j ，返回好数对的数目
 */

public class EP1512 {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
