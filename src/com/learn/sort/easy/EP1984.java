package com.learn.sort.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/11/8
 * @description : 一个下标从 0 开始的整数数组 nums，其中 nums[i] 表示第 i
 * 名学生的分数。另给一个整数 k、从数组中选出任意 k 名学生的分数，使这 k 个分
 * 数间最高分和最低分的差值达到最小化、返回可能的最小差值
 */
public class EP1984 {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = 1000000;
        for (int i = 0; i < nums.length - k + 1; i++) {
            min = Math.min(nums[i + k - 1] - nums[i], min);
        }
        return min;
    }
}
