package com.learn.binarySearch.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : Kristen
 * @date : 2021/10/27
 * @description :爱丽丝和鲍勃有不同大小的糖果棒：A[i] 是爱丽丝拥有的第 i
 * 根糖果棒的大小，B[j] 是鲍勃拥有的第 j 根糖果棒的大小。因为他们是朋友，
 * 所以他们想交换一根糖果棒，这样交换后，他们都有相同的糖果总量。
 * （一个人拥有的糖果总量是他们拥有的糖果棒大小的总和。）返回一个整数数组 ans，
 * 其中 ans[0] 是爱丽丝必须交换的糖果棒的大小，ans[1] 是 Bob 必须交换的糖果棒的大小
 */
public class EP888 {
    public int[] fairCandySwap(int[] alice, int[] bob) {
        int sumA = Arrays.stream(alice).sum();
        int sumB = Arrays.stream(bob).sum();
        int middle = (sumA - sumB) / 2;
        Set<Integer> rec = new HashSet<Integer>();
        for (int num : alice) {
            rec.add(num);
        }
        int[] result = new int[2];
        for (int y : bob) {
            int x = y + middle;
            if (rec.contains(x)) {
                result[0] = x;
                result[1] = y;
                break;
            }
        }
        return result;
    }
}
