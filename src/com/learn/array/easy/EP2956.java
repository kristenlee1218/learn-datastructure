package com.learn.array.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ：Kristen
 * @date ：2023/12/18
 * @description : 两个下标从 0 开始的整数数组 nums1 和 nums2，它们分别含有 n 和 m 个元素。
 * 请计算以下两个数值：统计 0 <= i < n 中的下标 i，满足 nums1[i] 在 nums2 中至少出现了一次。
 * 统计 0 <= i < m 中的下标 i，满足 nums2[i] 在 nums1 中至少出现了一次。返回一个长度为 2 的
 * 整数数组 answer，按顺序 分别为以上两个数值
 */
public class EP2956 {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int count1 = 0;
        int count2 = 0;
        int[] result = new int[2];
        Set<Integer> set1 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums2) {
            set2.add(i);
        }
        for (int j : nums1) {
            if (set2.contains(j)) {
                count1++;
            }
        }
        for (int j : nums2) {
            if (set1.contains(j)) {
                count2++;
            }
        }
        result[0] = count1;
        result[1] = count2;
        return result;
    }
}
