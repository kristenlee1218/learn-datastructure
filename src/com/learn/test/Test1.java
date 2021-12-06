package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description : EP26
 */
public class Test1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 2, 5, 5, 6, 6, 8};
        int single = 1;
        System.out.println(single ^= 1);
        for (int num : nums) {
            System.out.println(single ^= num);
            System.out.println("-------------");
        }
    }
}