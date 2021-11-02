package com.learn.test;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 4, 7, 11};
        int k = 5;
        Test.findKthPositive(nums, k);
    }

    public static int findKthPositive(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println("i: " + i);
            int value = nums[i] - i - 1;
            System.out.println("nums[i] - i - 1: " + value);
            System.out.println("-------------------------");
            if (nums[i] - i - 1 >= k) {
                return k + i;
            }
        }
        return k + nums.length;
    }
}
