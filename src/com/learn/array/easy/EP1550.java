package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/7/21
 * @description :一个整数数组 arr，请判断数组中是否存在连续三
 * 个元素都是奇数的情况：如果存在，请返回 true；否则返回 false
 */
public class EP1550 {
    public boolean threeConsecutiveOdds(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}
