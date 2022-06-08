package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test1 {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] boo = new boolean[51];
        for (int[] range : ranges) {
            for (int i = range[0]; i <= range[1]; i++) {
                boo[i] = true;
            }
        }
        for (int i = left; i <= right; i++) {
            if (!boo[i]) {
                return false;
            }
        }
        return true;
    }
}


