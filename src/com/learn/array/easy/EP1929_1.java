package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/7/29
 * @description : 一个长度为 n 的整数数组 nums 。请构建一个长度为 2n的答
 * 案数组 ans，数组下标 从 0 开始计数，对于所有 0 <= i < n 的 i，满足下述
 * 所有要求：ans[i] == nums[i]、ans 由两个 nums 数组串联形成。返回数组 ans
 */
public class EP1929_1 {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        System.arraycopy(nums, 0, result, 0, nums.length);
        System.arraycopy(nums, 0, result, nums.length, nums.length);
        return result;
    }
}
