package com.learn.interview.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2022/2/1
 * @description :数组 nums 包含从 0 到 n 的所有整数，但其中缺了
 * 一个。请编写代码找出那个缺失的整数。有办法在 O(n) 时间内完成吗？
 */
public class EP1704 {
    public int missingNumber(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int num = 0;
        Arrays.sort(nums);
        for (int j : nums) {
            if (j != num) {
                return num;
            }
            num++;
        }
        return num;
    }
}
