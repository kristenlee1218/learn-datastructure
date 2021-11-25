package com.learn.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description : EP219
 */
public class Test7 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (k >= i - map.get(nums[i])) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
