package com.learn.array.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Kristen
 * @date : 2021/11/7
 * @description :三个整数数组 nums1、nums2 和 nums3，请构造并
 * 返回一个与这三个数组都不同的数组，且由至少在两个数组中出现的
 * 所有值组成。数组中的元素可以按任意顺序排列
 */
public class EP2032 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();
        int[] a = new int[101];
        int[] b = new int[101];
        int[] c = new int[101];
        for (int num : nums1) {
            a[num] = 1;
        }
        for (int num : nums2) {
            b[num] = 1;
        }
        for (int num : nums3) {
            c[num] = 1;
        }
        for (int i = 1; i < 101; i++) {
            if (a[i] + b[i] + c[i] > 1) {
                list.add(i);
            }
        }
        return list;
    }
}
