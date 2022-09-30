package com.learn.offer2.easy;

/**
 * @author : Kristen
 * @date : 2022/2/10
 * @description : 给定一个已按照、非递减顺序排列的整数数组 numbers，
 * 从数组中找出两个数满足相加之和等于目标数 target、函数应该以长度为 2
 * 的整数数组的形式返回这两个数的下标值。numbers 的下标从 1 开始计数，
 * 所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length
 */
public class Offer006 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
