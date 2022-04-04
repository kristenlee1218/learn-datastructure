package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2022/3/24
 * @description :一个整数数组 nums，包含 2 * n 个整数。需要将 nums 划
 * 分成 n 个数对，满足每个元素只属于一个数对。同一数对中的元素相等。如果可
 * 以将 nums 划分成 n 个数对，请返回 true，否则返回 false
 */
public class EP2206 {
    public boolean divideArray(int[] nums) {
        int[] result = new int[501];
        for (int num : nums) {
            result[num]++;
        }
        for (int value : result) {
            if (value % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
