package com.learn.sort.easy;

/**
 * @author : Kristen
 * @date : 2021/8/19
 * @description :给定一个大小为 n 的数组，找到其中的多数元素。
 * 多数元素是指在数组中出现次数大于 n/2 的元素、可以假设数组是非空的，并且给定的数组总是存在多数元素
 */
public class EP169_1 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int result = 0;
        for (int num : nums) {
            if (count == 0) {
                result = num;
            }
            count += (num == result) ? 1 : -1;
        }
        return result;
    }
}
