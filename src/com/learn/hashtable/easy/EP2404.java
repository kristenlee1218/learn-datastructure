package com.learn.hashtable.easy;

/**
 * @author ：Kristen
 * @date ：2022/9/16
 * @description : 一个整数数组 nums，返回出现最频繁的偶数元素。如果存在多个满足条件的元素，
 * 只需要返回最小的一个。如果不存在这样的元素，返回 -1
 */
public class EP2404 {
    public int mostFrequentEven(int[] nums) {
        int[] result = new int[100001];
        int max = 0, min = -1;
        for (int i : nums) {
            if (i % 2 == 0) {
                result[i]++;
                if (result[i] > max) {
                    max = result[i];
                    min = i;
                } else if (result[i] == max) {
                    min = Math.min(min, i);
                }
            }
        }
        return min;
    }
}
