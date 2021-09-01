package com.learn.array.easy;

import java.util.Arrays;

/**
 * @author : Kristen
 * @date : 2021/8/14
 * @description :一个整数数组 arr，请删除最小 5% 的数字和最大 5% 的数字后，剩余数字的平均值。
 * 与标准答案误差在 10^-5 的结果都被视为正确结果
 */
public class EP1619 {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int length = arr.length;
        int length1 = length / 20;
        double sum = 0;
        double count = length - 2 * length1;
        for (int i = length1; i < length - length1; i++) {
            sum += arr[i];
        }
        return sum / count;
    }
}
