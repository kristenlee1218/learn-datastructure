package com.learn.offer.easy;

/**
 * @author : Kristen
 * @date : 2021/8/5
 * @description : 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
 * 比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999
 */
public class Offer17 {
    public int[] printNumbers(int n) {
        int sum = 1;
        for (int i = 0; i < n; i++) {
            sum *= 10;
        }
        int[] result = new int[sum - 1];
        for (int i = 0; i < sum - 1; i++) {
            result[i] = i + 1;
        }
        return result;
    }
}
