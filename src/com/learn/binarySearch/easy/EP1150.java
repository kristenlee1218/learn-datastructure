package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/10/31
 * @description :给出一个按非递减顺序排列的数组 nums，和一个目标数值 target。
 * 假如数组 nums 中绝大多数元素的数值都等于 target，则返回 True，否则请
 * 返回 False。所谓占绝大多数，是指在长度为 N 的数组中出现必须 超过 N/2 次。
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
