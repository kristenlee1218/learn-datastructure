package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/7/21
 * @description :给你两个非负整数 low 和 high、
 * 请你返回 low 和 high 之间（包括二者）奇数的数目
 */

public class EP1523 {
    public int countOdds(int low, int high) {
        int count = (high - low) / 2;
        if (low % 2 != 0 || high % 2 != 0) {
            count = count + 1;
        }
        return count;
    }
}
