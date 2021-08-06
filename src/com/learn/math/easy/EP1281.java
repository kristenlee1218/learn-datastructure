package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 一个整数 n，请计算并返回该整数「各位数字之积」与「各位数字之和」的差
 */
public class EP1281 {
    public int subtractProductAndSum(int n) {
        int muti = 1;
        int sum = 0;
        while (n != 0) {
            muti *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return muti - sum;
    }
}