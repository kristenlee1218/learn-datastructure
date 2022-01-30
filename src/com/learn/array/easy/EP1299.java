package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :一个数组 arr，请将每个元素用它右边最大的元素替换，
 * 如果是最后一个元素，用 -1 替换。完成所有替换操作后请返回这个数组
 */
public class EP1299 {
    public int[] replaceElements(int[] nums) {
        int max = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            int temp = nums[i];
            nums[i] = max;
            if (temp > max) {
                max = temp;
            }
        }
        return nums;
    }
}
