package com.learn.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : EP26
 */
public class Test1 {
    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }
        return count <= 1;
    }
}