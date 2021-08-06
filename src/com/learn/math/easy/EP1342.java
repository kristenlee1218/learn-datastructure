package com.learn.math.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :一个非负整数 num，请返回将它变成 0 所需要的步数。如果当前数字是偶数，
 * 需要把它除以 2、否则减去 1
 */
public class EP1342 {
    public int numberOfSteps(int num) {
        int i = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            i++;
        }
        return i;
    }
}
