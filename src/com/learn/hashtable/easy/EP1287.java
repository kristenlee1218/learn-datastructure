package com.learn.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2022/5/17
 * @description :
 */
public class EP1287 {
    public int findSpecialInteger(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (map.get(num) * 4 > nums.length) {
                return num;
            }
        }
        return -1;
    }
}
