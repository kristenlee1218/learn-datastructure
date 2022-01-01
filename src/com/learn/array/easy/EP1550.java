package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/7/21
 * @description :给你一个整数数组 arr，请你判断数组中是否存在连续
 * 三个元素都是奇数的情况：如果存在，请返回 true；否则返回 false
 */

public class EP1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] % 2 == 1 && arr[i + 1] % 2 == 1 && arr[i + 2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}
