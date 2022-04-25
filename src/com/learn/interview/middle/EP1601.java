package com.learn.interview.middle;

/**
 * @author : Kristen
 * @date : 2022/2/1
 * @description : 编写一个函数，不用临时变量，直接交换
 * numbers = [a, b] 中 a 与 b 的值
 */
public class EP1601 {
    public int[] swapNumbers(int[] nums) {
        nums[1] = nums[0] + nums[1];
        nums[0] = nums[1] - nums[0];
        nums[1] = nums[1] - nums[0];
        return nums;
    }
}
