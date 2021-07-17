package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/7/17
 * @description :给定一个已按照升序排列的整数数组 numbers，
 * 请从数组中找出两个数满足相加之和等于目标数 target
 */
public class EP167 {

    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == target - numbers[i]) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
