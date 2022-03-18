package com.learn.interview.easy;

/**
 * @author : Kristen
 * @date : 2022/1/31
 * @description :在数组 A[0...n-1] 中，有所谓的魔术索引，满足条件 A[i] = i。
 * 给定一个有序整数数组，编写一种方法找出魔术索引，若有的话，在数组 A 中找出一个
 * 魔术索引，如果没有，则返回 -1。若有多个魔术索引，返回索引值最小的一个
 */
public class EP0803 {
    public int findMagicIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) {
                return i;
            }
            i = Math.max(nums[i], i + 1);
        }
        return -1;
    }
}
