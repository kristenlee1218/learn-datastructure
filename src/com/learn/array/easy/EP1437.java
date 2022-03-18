package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/17
 * @description : 一个由若干 0 和 1 组成的数组 nums 以及整数 k。
 * 如果所有 1 都至少相隔 k 个元素，则返回 true；否则返回 false
 */
public class EP1437 {
    public boolean kLengthApart(int[] nums, int k) {
        int index = -k - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (i - index - 1 < k) {
                    return false;
                }
                index = i;
            }
        }
        return true;
    }
}
