package com.learn.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/8/18
 * @description :给定一个二进制数组， 计算其中最大连续 1 的个数
 */
public class EP485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        int n = nums.length;
        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        max = Math.max(max, count);
        return max;
    }
}
