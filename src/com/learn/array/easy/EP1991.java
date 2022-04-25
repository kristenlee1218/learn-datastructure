package com.learn.array.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2022/1/17
 * @description : 一个下标从 0 开始的整数数组 nums，请找到最左边的
 * 中间位置 middleIndex （也就是所有可能中间位置下标最小的一个）。
 * 中间位置 middleIndex 是满足 nums[0] + nums[1] + ... +
 * nums[middleIndex-1] == nums[middleIndex+1] +
 * nums[middleIndex+2] + ... + nums[nums.length-1] 的数组
 * 下标。如果 middleIndex == 0 ，左边部分的和定义为 0。类似的，
 * 如果 middleIndex == nums.length - 1 ，右边部分的和定义为 0。
 * 请返回满足上述条件最左边的 middleIndex，如果不存在这样的中间位置，
 * 请返回 -1
 */
public class EP1991 {
    public int findMiddleIndex(int[] nums) {
        int count = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (2 * sum + nums[i] == count) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }
}
