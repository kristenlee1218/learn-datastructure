package com.learn.interview.easy;

import java.util.HashMap;

/**
 * @author : Kristen
 * @date : 2022/2/1
 * @description :数组中占比超过一半的元素称之为主要元素。给定一个
 * 整数数组，找到它的主要元素。若没有返回 -1
 */
public class EP1710 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > (nums.length / 2)) {
                return num;
            }
        }
        return -1;
    }
}
