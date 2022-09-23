package com.learn.offer.easy;

/**
 * @author ：Kristen
 * @date ：2022/9/23
 * @description : 统计一个数字在排序数组中出现的次数
 */
public class Offer53_1 {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int count = 0;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                right = mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        while (left < nums.length && nums[left++] == target) {
            count++;
        }
        return count;
    }
}
