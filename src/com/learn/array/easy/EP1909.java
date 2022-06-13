package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/31
 * @description : 一个下标从 0 开始的整数数组 nums，如果恰好删除一个元素后，数组严
 * 格递增，那么请返回 true，否则返回 false、如果数组本身已经是严格递增的，返回 true
 */
public class EP1909 {
    public boolean canBeIncreasing(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                count++;
                if (count > 1) {
                    return false;
                }
                if (i > 1 && nums[i] <= nums[i - 2]) {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return true;
    }
}
