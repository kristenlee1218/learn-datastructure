package com.learn.offer.easy;

/**
 * @author : Kristen
 * @date : 2021/8/5
 * @description : 把一个数组最开始的若干个元素搬到数组的末尾，称之为
 * 数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素
 */
public class Offer11 {
    public int minArray(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[high]) {
                high = mid;
            } else if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high -= 1;
            }
        }
        return nums[low];
    }
}
