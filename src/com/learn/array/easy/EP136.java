package com.learn.array.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2021/11/6
 * @description :给定一个非空整数数组，除了某个元素只出现一次以外，
 * * 其余每个元素均出现两次。找出那个只出现了一次的元素
 */
public class EP136 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.remove(num);
            } else {
                map.put(num, 1);
            }
        }
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        return iterator.next();
    }
}
