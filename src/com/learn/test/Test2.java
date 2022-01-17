package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test2 {
    public int findTheDistanceValue(int[] nums1, int[] nums2, int d) {
        int count = 0;
        for (int x : nums1) {
            boolean b = true;
            for (int y : nums2) {
                b &= Math.abs(x - y) > d;
            }
            count += b ? 1 : 0;
        }
        return count;
    }
}

