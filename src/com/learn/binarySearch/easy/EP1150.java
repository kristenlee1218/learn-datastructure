package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/10/31
 * @description : 一个按非递减顺序排列的数组 nums，和一个目标数值 target。
 * 假如数组 nums 中绝大多数元素的数值都等于 target，返回 true，否则，返回
 * false。所谓占绝大多数是指在长度为 n 的数组中出现必须超过 n/2 次
 */
public class EP1150 {
    public boolean isMajorityElement(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target) {
                count++;
            }
        }
        return count > nums.length / 2;
    }
}
