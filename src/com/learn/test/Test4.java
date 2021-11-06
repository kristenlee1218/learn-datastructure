package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/11/5
 * @description :
 */
public class Test4 {
    public int third(int[] nums) {
        int one = Integer.MIN_VALUE;
        int two = Integer.MIN_VALUE;
        int three = Integer.MIN_VALUE;
        boolean boo = false;
        for (int num : nums) {
            if (num >= one) {
                one = num;
            }
        }
        for (int num : nums) {
            if (num >= two && num != one) {
                two = num;
            }
        }
        for (int num : nums) {
            if (num >= three && num != one && num != two) {
                three = num;
                boo = true;
            }
        }
        return boo ? three : one;
    }
}
