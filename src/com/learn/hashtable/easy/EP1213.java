package com.learn.hashtable.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2021/10/31
 * @description :给出三个均为严格递增排列的整数数组 arr1，arr2 和 arr3。
 * 返回一个由仅在这三个数组中同时出现的整数所构成的有序数组
 */
public class EP1213 {
    public List<Integer> arraysIntersection(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        for (int value : nums1) {
            set1.add(value);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int value : nums2) {
            set2.add(value);
        }

        List<Integer> list = new ArrayList<>();
        for (int value : nums3) {
            if (set1.contains(value) && set2.contains(value)) {
                list.add(value);
            }
        }
        return list;
    }
}
