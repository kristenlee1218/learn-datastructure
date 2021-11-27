package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :EP136
 */
public class Test4 {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}
