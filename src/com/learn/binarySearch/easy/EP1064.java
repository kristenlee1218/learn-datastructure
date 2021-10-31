package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/10/31
 * @description :给定已经按升序排列、由不同整数组成的数组 arr，
 * 返回满足 arr[i] == i 的最小索引 i。如果不存在这样的 i，返回 -1
 */
public class EP1064 {
    public int fixedPoint(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            if (i == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
