package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2022/4/27
 * @description : 一个下标从 0 开始的整数数组 nums。根据下述规
 * 则重排 nums 中的值：按非递增顺序排列 nums 奇数下标上的所有值
 *
 * 举个例子，如果排序前 nums = [4,1,2,3]，对奇数下标的值排序后
 * 变为 [4,3,2,1]。奇数下标 1 和 3 的值按照非递增顺序重排。按非
 * 递减顺序排列 nums 偶数下标上的所有值
 *
 * 举个例子，如果排序前 nums = [4,1,2,3]，对偶数下标的值排序后
 * 变为 [2,1,4,3]。偶数下标 0 和 2 的值按照非递减顺序重排。返回
 * 重排 nums 的值之后形成的数组
 */
public class EP2164 {
    public int[] sortEvenOdd(int[] nums) {
        for (int i = 0; i < nums.length - 2; i += 2) {
            for (int j = 0; j < nums.length - i - 2; j++) {
                if (j % 2 == 0 && nums[j] > nums[j + 2] || j % 2 == 1 && nums[j] < nums[j + 2]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 2];
                    nums[j + 2] = tmp;
                }
            }
        }
        return nums;
    }
}
