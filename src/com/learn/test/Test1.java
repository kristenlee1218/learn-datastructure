package com.learn.test;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test1 {
    public boolean canThreePartsEqualSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 3 != 0) {
            return false;
        }
        sum /= 3;
        int temp = 0, count = 0;
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