package com.learn.hashtable.easy;

import java.util.HashMap;

/**
 * @author : Kristen
 * @date : 2021/7/25
 * @description : 给你一个整数数组 nums。数组中唯一元素是那些
 * 只出现恰好一次的元素。请你返回 nums 中唯一元素的和
 */

public class EP1748 {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                sum += key;
            }
        }
        return sum;
    }
}
