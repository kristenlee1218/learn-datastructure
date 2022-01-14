package com.learn.hashtable.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :一个整数数组 arr，请统计数组中每个数的出现次数。
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false
 */
public class EP1207 {
    public boolean uniqueOccurrences(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map.size() == new HashSet<>(map.values()).size();
    }
}
