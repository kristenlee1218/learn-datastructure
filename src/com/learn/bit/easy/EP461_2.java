package com.learn.bit.easy;

/**
 * @author : Kristen
 * @date : 2022/1/2
 * @description : 两个整数之间的汉明距离指的是这两个数字对应二进制
 * 位不同的位置的数目。两个整数 x 和 y，计算并返回它们之间的汉明距离
 */
public class EP461_2 {
    public int hammingDistance(int x, int y) {
        int n = x ^ y, result = 0;
        while (n != 0) {
            n &= n - 1;
            result++;
        }
        return result;
    }
}
