package com.learn.array.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :在整数数组中，如果一个整数的出现频次和它的数值大小相等，
 * 就称这个整数为「幸运数」、一个整数数组 arr，请从中找出并返回一个幸运数。
 * 如果数组中存在多个幸运数，只需返回最大的那个。如果数组中不含幸运数则返回 -1
 */
public class EP1394 {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int x : arr) {
            m.put(x, m.getOrDefault(x, 0) + 1);
        }
        int ans = -1;
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            int key = entry.getKey(), value = entry.getValue();
            if (key == value) {
                ans = Math.max(ans, key);
            }
        }
        return ans;
    }
}
