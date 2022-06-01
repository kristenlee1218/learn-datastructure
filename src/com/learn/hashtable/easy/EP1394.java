package com.learn.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : 在整数数组中，如果一个整数的出现频次和它的数值大小相等，就
 * 称这个整数为「幸运数」、一个整数数组 arr，请从中找出并返回一个幸运数。如果
 * 数组中存在多个幸运数，只需返回最大的那个。如果数组中不含幸运数则返回 -1
 */
public class EP1394 {
    public int findLucky(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = -1;
        for (int num : nums) {
            if (map.get(num) == num) {
                count = Math.max(num, count);
            }
        }
        return count;
    }
}
