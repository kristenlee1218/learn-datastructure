package com.learn.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Kristen
 * @date : 2022/5/17
 * @description : 一个非递减的有序整数数组，已知这个数组中恰好有
 * 一个整数，它的出现次数超过数组元素总数的 25%、请返回这个整数
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
