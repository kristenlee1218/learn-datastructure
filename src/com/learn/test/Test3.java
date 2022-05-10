package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test3 {
    public int majorityElement(int[] nums) {
        int count = 0, result = 0;
        for (int num : nums) {
            if (count == 0) {
                result = num;
            }
            count += (result == num) ? 1 : -1;
        }
        return result;
    }
}
