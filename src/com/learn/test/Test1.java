package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test1 {
    public int minCostToMoveChips(int[] chips) {
        int odd = 0, even = 0;
        for (int num : chips) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(even, odd);
    }
}