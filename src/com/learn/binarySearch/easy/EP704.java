package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/10/27
 * @description : 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值
 * target，搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1
 *
 */
public class EP704 {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
