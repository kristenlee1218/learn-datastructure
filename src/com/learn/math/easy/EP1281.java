package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 一个整数 n，计算并返回该整数各位数字之积与各位数字之和的差
 */
public class EP1281 {
    public int subtractProductAndSum(int n) {
        int multi = 1;
        int sum = 0;
        while (n > 0) {
            multi *= n % 10;
            sum += n % 10;
            n /= 10;
        }
        return multi - sum;
    }
}
