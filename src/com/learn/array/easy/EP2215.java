package com.learn.array.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2022/4/27
 * @description : 两个下标从 0 开始的整数数组 nums1 和 nums2，
 * 请返回一个长度为 2 的列表 answer，其中：
 *
 * answer[0] 是 nums1 中所有不存在于 nums2 中的不同整数组成的列表
 * answer[1] 是 nums2 中所有不存在于 nums1 中的不同整数组成的列表
 *
 * 注意：列表中的整数可以按任意顺序返回
 */
public class EP2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        for (int i : set1) {
            if (!set2.contains(i)) {
                list1.add(i);
            }
        }
        for (int i : set2) {
            if (!set1.contains(i)) {
                list2.add(i);
            }
        }
        list.add(list1);
        list.add(list2);
        return list;
    }
}
