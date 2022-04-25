package com.learn.array.easy;

/**
 * @author ：Kristen
 * @date ：2022/2/25
 * @description : 一个正整数 num，请统计并返回小于或等于 num 且各位数字之和
 * 为偶数的正整数的数目。正整数的各位数字之和是其所有位上的对应数字相加的结果
 */
public class EP2180 {
    public int countEven(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (check(i)) {
                count++;
            }
        }
        return count;
    }

    public boolean check(int num) {
        int checkNum = 0;
        while (num > 0) {
            checkNum = checkNum + (num % 10);
            num /= 10;
        }
        return checkNum % 2 == 0;
    }
}