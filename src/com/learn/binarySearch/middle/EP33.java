package com.learn.binarySearch.middle;

/**
 * @author : Kristen
 * @date : 2021/11/3
 * @description :整数数组 nums 按升序排列，数组中的值互不相同。在传递给函数之前，
 * nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了旋转，使数组变为
 * [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
 * （下标 从 0 开始 计数）。例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为
 * [4,5,6,7,0,1,2]。旋转后的数组 nums 和一个整数 target，如果 nums 中存在这个
 * 目标值 target，则返回它的下标，否则返回 -1
 */
public class EP33 {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[nums.length - 1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
