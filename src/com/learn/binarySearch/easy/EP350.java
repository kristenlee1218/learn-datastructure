package com.learn.binarySearch.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/10/31
 * @description :给定两个数组，编写一个函数来计算它们的交集（可以有重复的值）
 */
public class EP350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for (int value : nums1) {
            list1.add(value);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int value : nums2) {
            if (list1.contains(value)) {
                list2.add(value);
                list1.remove(Integer.valueOf(value));
            }
        }
        int[] result = new int[list2.size()];
        int index = 0;
        for (int value : list2) {
            result[index++] = value;
        }
        return result;
    }
}
