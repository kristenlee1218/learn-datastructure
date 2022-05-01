package com.learn.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test1 {
    public int dominantIndex(int[] nums) {
        Arrays.sort(nums);
        if (nums[nums.length - 1] > nums[nums.length - 2] * 2) {
            return nums.length - 1;
        }
    }
}