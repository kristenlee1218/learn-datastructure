package com.learn.sort.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/11/6
 * @description :
 */
public class EP1636 {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        list.sort((a, b) -> {
            int aCount = map.get(a);
            int bCount = map.get(b);
            if (aCount == bCount) {
                return b - a;
            }
            return aCount - bCount;
        });

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
