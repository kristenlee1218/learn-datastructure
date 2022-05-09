package com.learn.hashtable.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description : 一个整数数组 arr，请检查是否存在两个整数 N 和 M，满足
 * N 是 M 的两倍（即，N = 2 * M）检查是否存在两个下标 i 和 j 满足 i != j、
 * 0 <= i, j < arr.length、arr[i] == 2 * arr[j]
 */
public class EP1346 {
    public boolean checkIfExist(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == 2 * nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
