package com.learn.binarySearch.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2021/7/17
 * @description :给定两个数组，编写一个函数来计算它们的交集
 */

public class EP349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int value : nums1) {
            set1.add(value);
        }
        for (int value : nums2) {
            if (set1.contains(value)) {
                set2.add(value);
            }
        }
        int[] result = new int[set2.size()];
        int count = 0;
        for (Integer i : set2) {
            result[count++] = i;
        }
        return result;
    }
}