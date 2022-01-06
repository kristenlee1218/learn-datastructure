package com.learn.array.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2022/1/6
 * @description :一个整数数组 arr，对于元素 x，只有当 x + 1 也在数组 arr
 * 里时，才能记为 1 个数、如果数组 arr 里有重复的数，每个重复的数单独计算
 */
public class EP1426 {
    public int countElements(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int value : map.keySet()) {
            if (map.containsKey(value + 1)) {
                count += map.get(value);
            }
        }
        return count;
    }
}
