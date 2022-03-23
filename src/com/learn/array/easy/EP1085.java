package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2022/1/5
 * @description :一个正整数的数组 A。然后计算 S，使其等于数组 A 当中最小的那个
 * 元素各个数位上数字之和。最后，假如 S 所得计算结果是 奇数，返回 0；否则请返回 1
 */
public class EP1085 {
    public int sumOfDigits(int[] nums) {
        int min = Integer.MAX_VALUE, result = 0;
        for (int value : nums) {
            min = Math.min(value, min);
        }
        while (min != 0) {
            result += min % 10;
            min /= 10;
        }
        return result % 2 == 1 ? 0 : 1;
    }
}
