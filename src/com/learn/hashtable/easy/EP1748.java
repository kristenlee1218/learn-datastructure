package com.learn.hashtable.easy;

/**
 * @author : Kristen
 * @date : 2021/7/25
 * @description : 一个整数数组 nums。数组中唯一元素是
 * 那些只出现恰好一次的元素。请返回 nums 中唯一元素的和
 */

public class EP1748 {
    public int sumOfUnique(int[] nums) {
        int[] result = new int[101];
        for (int num : nums) {
            result[num]++;
        }
        int sum = 0;
        for (int i = 1; i < result.length; i++) {
            if (result[i] == 1) {
                sum += i;
            }
        }
        return sum;
    }
}
