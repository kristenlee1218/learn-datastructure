package com.learn.offer.easy;

/**
 * @author : Kristen
 * @date : 2022/4/23
 * @description : 输入一个递增排序的数组和一个数字 s，在数组中查找两个数，
 * 使得它们的和正好是 s。如果有多对数字的和等于 s，则输出任意一对即可
 */
public class Offer57_1 {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (target - nums[right] == nums[left]) {
                return new int[]{nums[left], nums[right]};
            }
            while (target - nums[right] < nums[left] && left < right) {
                right--;
            }
            while (target - nums[right] > nums[left] && left < right) {
                left++;
            }
        }
        return new int[0];
    }
}
