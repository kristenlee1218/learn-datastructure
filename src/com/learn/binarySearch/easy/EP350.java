package com.learn.binarySearch.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/10/31
 * @description :给定两个数组，编写一个函数来计算它们的交集。
 */
public class EP350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        for (int num : nums1) {
            list1.add(num);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int num : nums2) {
            if (list1.contains(num)) {
                list2.add(num);
                list1.remove(Integer.valueOf(num));
            }
        }
        int[] result = new int[list2.size()];
        int i = 0;
        for (int num : list2) {
            result[i++] = num;
        }
        return result;
    }
}
