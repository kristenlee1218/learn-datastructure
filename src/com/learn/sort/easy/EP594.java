package com.learn.sort.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/11/4
 * @description :
 */
public class EP594 {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int begin = 0, result = 0;
        for (int end = 0; end < nums.length; end++) {
            while (nums[end] - nums[begin] > 1) {
                begin++;
            }
            if (nums[end] - nums[begin] == 1) {
                result = Math.max(result, end - begin + 1);
            }
        }
        return result;
    }
}
