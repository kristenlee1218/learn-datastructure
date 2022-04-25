package com.learn.array.middle;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description : 一个长度为 n 的整数数组，请判断在最多改变 1 个元素的情
 * 况下，该数组能否变成一个非递减数列、定义一个非递减数列的：对于数组中所有
 * 的 i (0 <= i <= n-2)，总满足 nums[i] <= nums[i + 1]
 */
public class EP665 {
    public boolean checkPossibility(int[] nums) {
        if (nums.length < 3) {
            return true;
        }
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                if (count > 1) {
                    break;
                }
                if (i - 1 >= 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                } else {
                    nums[i] = nums[i + 1];
                }
            }
        }
        return count <= 1;
    }
}
