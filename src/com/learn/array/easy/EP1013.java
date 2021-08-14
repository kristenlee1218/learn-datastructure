package com.learn.array.easy;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false
 */
public class EP1013 {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int num : A) {
            sum += num;
        }
        // 数组A的和如果不能被3整除返回false
        if (sum % 3 != 0) {
            return false;
        }
        // 遍历数组累加，每累加到目标值cnt加1，表示又找到1段,
        // 找到2段后就返回true（i只能到数组A的倒数第二个元素，保证了有第3段）
        sum /= 3;
        int curSum = 0, cnt = 0;
        for (int i = 0; i < A.length - 1; i++) {
            curSum += A[i];
            if (curSum == sum) {
                cnt++;
                if (cnt == 2) {
                    return true;
                }
                curSum = 0;
            }
        }
        return false;
    }
}
