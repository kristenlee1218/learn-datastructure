package com.learn.offer.easy;

/**
 * @author ：Kristen
 * @date ：2022/9/23
 * @description : 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 可以假设数组是非空的，并且给定的数组总是存在多数元素
 */
public class Offer39_1 {
    public int majorityElement(int[] nums) {
        int result = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                result = num;
            }
            if (num == result) {
                count++;
            } else {
                count--;
            }
        }
        return result;
    }
}
