package com.learn.sort.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/7/25
 * @description : 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，
 * 使 nums1 成为一个有序数组。初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素
 */

public class EP88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; i < m + n; i++, j++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }
}
