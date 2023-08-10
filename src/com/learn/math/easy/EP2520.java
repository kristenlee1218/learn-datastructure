package com.learn.math.easy;

/**
 * @author ：Kristen
 * @date ：2023/8/9
 * @description : 一个整数 n，返回 n 中能整除 n 的数位的数目。如果满足 nums % val == 0，
 * 则认为整数 val 可以整除 n
 */
public class EP2520 {
    public int countDigits(int n) {
        int count = 0;
        int temp = n;
        while (temp > 0) {
            int cur = temp % 10;
            count += (n % cur) == 0 ? 1 : 0;
            temp /= 10;
        }
        return count;
    }
}
