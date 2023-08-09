package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2022/3/13
 * @description : 两个非负整数 num1 和 num2、每一步操作中，如果 num1 >= num2，必须用num1 减 num2；
 * 否则，必须用 num2 减 num1、返回使 num1 = 0 或 num2 = 0 的操作数
 *
 */
public class EP2169 {
    public int countOperations(int num1, int num2) {
        int result = 0;
        while (num1 > 0 && num2 > 0) {
            if (num1 >= num2) {
                num1 -= num2;
            } else {
                num2 -= num1;
            }
            result++;
        }
        return result;
    }
}
