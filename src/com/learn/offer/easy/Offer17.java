package com.learn.offer.easy;

/**
 * @author : Kristen
 * @date : 2021/8/5
 * @description :输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
 * 比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999
 */
public class Offer17 {
    public int[] printNumbers(int n) {
        double length = Math.pow(10, n) - 1;
        int[] result = new int[(int) length];
        for (int i = 0; i < length; i++) {
            result[i] = i + 1;
        }
        return result;
    }
}
