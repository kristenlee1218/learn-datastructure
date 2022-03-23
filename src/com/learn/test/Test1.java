package com.learn.test;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :
 */
public class Test1 {
    public int[] findErrorNums(int[] nums) {
        boolean[] boo = new boolean[nums.length + 1];
        int duplicate = 0, absent = 0;
        for (int i : nums) {
            if (boo[i]) {
                duplicate = i;
            } else {
                boo[i] = true;
            }
        }
        for (int k = 1; k <= nums.length; k++) {
            if (!boo[k]) {
                absent = k;
                break;
            }
        }
        return new int[]{duplicate, absent};
    }
}