package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/10/31
 * @description :两个整数数组 arr1，arr2 和一个整数 d，请返回两个数组之间的距离值
 * 「距离值」定义为符合此距离要求的元素数目：对于元素 arr1[i]，不存在任何元素 arr2[j]
 * 满足 |arr1[i]-arr2[j]| <= d
 */
public class EP1385 {
    public int findTheDistanceValue(int[] nums1, int[] nums2, int d) {
        int count = 0;
        for (int x : nums1) {
            boolean flag = true;
            for (int y : nums2) {
                flag &= Math.abs(x - y) > d;
            }
            count += flag ? 1 : 0;
        }
        return count;
    }
}
