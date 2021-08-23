package com.learn.math.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2021/8/16
 * @description : 给定一个包含 [0, n]中 n 个数的数组 nums，
 * 找出 [0, n] 这个范围内没有出现在数组中的那个数
 */

public class EP268 {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i < nums.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }
}
