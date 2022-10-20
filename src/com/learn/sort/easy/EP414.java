package com.learn.sort.easy;

/**
 * @author : Kristen
 * @date : 2021/7/17
 * @description : 给一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数
 */
public class EP414 {
    public static int thirdMax(int[] nums) {
        int one = Integer.MIN_VALUE;
        int two = Integer.MIN_VALUE;
        int three = Integer.MIN_VALUE;
        boolean b = false;
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
            if (num >= three && num != two && num != one) {
                three = num;
                b = true;
            }
        }
        return !b ? one : three;
    }
}
