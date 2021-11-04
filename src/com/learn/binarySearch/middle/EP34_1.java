package com.learn.binarySearch.middle;

/**
 * @author : Kristen
 * @date : 2021/11/3
 * @description :
 */
public class EP34_1 {
    public int[] searchRange(int[] nums, int target) {
        int leftIndex = binarySearch(nums, target, true);
        int rightIndex = binarySearch(nums, target, false) - 1;
        if (leftIndex <= rightIndex && rightIndex < nums.length &&
                nums[leftIndex] == target && nums[rightIndex] == target) {
            return new int[]{leftIndex, rightIndex};
        }
        return new int[]{-1, -1};
    }

    public int binarySearch(int[] nums, int target, boolean flag) {
        int left = 0, right = nums.length - 1, result = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (flag && nums[mid] >= target)) {
                right = mid - 1;
                result = mid;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}
