package com.learn.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test1 {
    public int missingNumber(int[] nums) {
        int total = nums.length * (nums.length + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return total - sum;
    }
}