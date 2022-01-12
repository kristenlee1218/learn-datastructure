package com.learn.hashtable.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2022/1/4
 * @description :一个整数数组 A，请找出并返回在该数组中仅出现一次的最大整数。
 * 如果不存在这个只出现一次的整数，则返回 -1
 */
public class EP1133 {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 0; i--) {
            if (map.get(nums[i]) == 1) {
                return nums[i];
            }
        }
        return -1;
    }
}
