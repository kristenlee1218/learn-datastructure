package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :
 */
public class Test {
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
