package com.learn.greedy.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :一个整数数组 A，只有可以将其划分为三个和相等的
 * 非空部分时才返回 true，否则返回 false
 */
public class EP1013 {
    public boolean canThreePartsEqualSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 3 != 0) {
            return false;
        }
        sum /= 3;
        int count = 0, temp = 0;
        for (int num : nums) {
            temp += num;
            if (temp == sum) {
                count++;
                temp = 0;
            }
        }
        return count >= 3;
    }
}
