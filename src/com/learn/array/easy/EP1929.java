package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/7/29
 * @description :给你一个长度为 n 的整数数组 nums 。请你构建一个长度为 2n的答
 * 案数组 ans，数组下标 从 0 开始计数，对于所有 0 <= i < n 的 i，满足下述
 * 所有要求：ans[i] == nums[i]、ans 由两个 nums 数组串联形成。返回数组 ans
 *
 */
public class EP1929 {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
        }
        for (int i = nums.length; i < result.length; i++) {
            result[i] = nums[i-nums.length];
        }
        return result;
    }
}
