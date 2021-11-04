package com.learn.binarySearch.middle;

/**
 * @author : Kristen
 * @date : 2021/11/3
 * @description :给定一个按照升序排列的整数数组 nums，和一个目标值 target。
 * 找出给定目标值在数组中的开始位置和结束位置。如果数组中不存在目标值 target，
 * 返回 [-1, -1]
 */
public class EP34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int[] result = new int[]{-1, -1};
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                int m = mid;
                while (left <= m && nums[m] == target) {
                    result[0] = m--;
                }
                int n = mid;
                while (n <= right && nums[n] == target) {
                    result[1] = n++;
                }
                return result;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
