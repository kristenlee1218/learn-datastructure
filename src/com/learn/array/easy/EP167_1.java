package com.learn.array.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/7/17
 * @description :
 */

public class EP167_1 {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int partnerNumber = target - numbers[i];
            if (map.containsKey(partnerNumber)) {
                return new int[]{map.get(partnerNumber) + 1, i + 1};
            }
            map.put(numbers[i], i);
        }
        return new int[]{-1, -1};
    }
}
