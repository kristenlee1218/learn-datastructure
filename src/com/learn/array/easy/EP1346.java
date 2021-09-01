package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/6
 * @description :一个整数数组 arr，请检查是否存在两个整数 N 和 M，
 * 满足 N 是 M 的两倍（即，N = 2 * M）更正式地，检查是否存在两个下标 i 和 j 满足 i != j、
 * 0 <= i, j < arr.length、arr[i] == 2 * arr[j]
 */
public class EP1346 {
    public boolean checkIfExist(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}
