package com.learn.array.easy;

import java.util.Arrays;

/**
 * @author ：Kristen
 * @date ：2022/01/25
 * @description :一个整数数组 nums，统计并返回在 nums 中同时具有一个
 * 严格较小元素和一个严格较大元素的元素数目。
 */
public class EP2148 {
    public int countElements(int[] nums) {
        if (nums.length <= 2) {
            return 0;
        }
        Arrays.sort(nums);
        int count = 0, pre = nums[0], value = nums[nums.length - 1];
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > pre && nums[i] < value) {
                count++;
            }
        }
        return count;
    }
}
