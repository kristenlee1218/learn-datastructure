package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2022/1/18
 * @description : 给一个下标从 0 开始的整数数组 nums，返回满足
 * 下述条件的不同四元组 (a, b, c, d) 的数目：nums[a] + nums[b]
 * + nums[c] == nums[d]，且 a < b < c < d
 */
public class EP1995 {
    public int countQuadruplets(int[] nums) {
        int count = 0;
        for (int a = 0; a < nums.length; a++) {
            for (int b = a + 1; b < nums.length; b++) {
                for (int c = b + 1; c < nums.length; c++) {
                    for (int d = c + 1; d < nums.length; d++) {
                        if (nums[a] + nums[b] + nums[c] == nums[d]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
