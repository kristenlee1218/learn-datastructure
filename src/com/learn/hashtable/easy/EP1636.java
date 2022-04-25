package com.learn.hashtable.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/11/6
 * @description : 一个整数数组 nums，请将数组按照每个值的频率升序排序。如
 * 果有多个值的频率相同，请按照数值本身将它们降序排序、请你返回排序后的数组
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
