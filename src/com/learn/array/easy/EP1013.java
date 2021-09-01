package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false
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
        int curSum = 0, count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            curSum += nums[i];
            if (curSum == sum) {
                count++;
                if (count == 2) {
                    return true;
                }
                curSum = 0;
            }
        }
        return false;
    }
}
