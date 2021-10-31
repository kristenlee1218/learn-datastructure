package com.learn.binarySearch.easy;

/**
 * @author : Kristen
 * @date : 2021/10/31
 * @description :
 */
public class EP1608 {
    public int specialArray(int[] nums) {
        int max = 0;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        int[] counts = new int[max + 1];
        for (int num : nums) {
            counts[num] += 1;
        }
        int sum = 0;
        for (int i = max; i >= 0; i--) {
            sum += counts[i];
            if (sum == i) {
                return i;
            }
        }
        return -1;
    }
}
