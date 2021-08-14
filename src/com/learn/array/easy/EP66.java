package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一、
 * 最高位数字存放在数组的首位，数组中每个元素只存储单个数字、可以假设除了整数 0 之外，
 * 这个整数不会以零开头
 */
public class EP66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
